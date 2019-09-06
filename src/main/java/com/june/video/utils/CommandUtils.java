package com.june.video.utils;

import com.june.video.domain.SingleExecutor;
import org.apache.commons.exec.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CommandUtils {
    public static final String HAS_ALREADY = "isNew";
    private static final Logger logger = LoggerFactory.getLogger(CommandUtils.class);
    public static final String EXECUTOR = "executor";

    public ConcurrentMap<String, SingleExecutor> executorConcurrentMap = new ConcurrentHashMap<>();

    public void runFFmpegCmd(String cid, String srcUrl, String dstUrl, Long timeOut) {
        CommandLine cmdLine = new CommandLine("ffmpeg");
        cmdLine.addArgument("-i");
        cmdLine.addArgument("${src}");
        cmdLine.addArgument("-q");
        cmdLine.addArgument("4");
        cmdLine.addArgument("-f");
        cmdLine.addArgument("mpegts");
        cmdLine.addArgument("-codec:v");
        cmdLine.addArgument("mpeg1video");
        cmdLine.addArgument("-s");
        cmdLine.addArgument("640x480");
        cmdLine.addArgument("${dest}");

        Map<String, String> map = new HashMap();
        map.put("src", srcUrl);
        map.put("dest", dstUrl);

        cmdLine.setSubstitutionMap(map);

        timeOut = timeOut == null ? ExecuteWatchdog.INFINITE_TIMEOUT : timeOut;
        ExecuteWatchdog watchdog = null;

        Map result = getOrCreate(cid);
        SingleExecutor singleExecutor = (SingleExecutor)result.get(EXECUTOR);
        boolean isAlreadyExisted = (boolean)result.get(HAS_ALREADY);
        Executor executor = singleExecutor.getExecutor();
        if(!isAlreadyExisted) {
            watchdog = new ExecuteWatchdog(timeOut);
            executeUnderControl(cmdLine, watchdog, executor);
        } else {
            boolean isWatching = executor.getWatchdog().isWatching();
            boolean killed = executor.getWatchdog().killedProcess();
            logger.error("Current watchdog status: {}, isKilled: {}", isWatching, killed);
            watchdog = new ExecuteWatchdog(timeOut);
            if(killed) {
                executeUnderControl(cmdLine, watchdog, executor);
            }
        }
    }

    private void executeUnderControl(CommandLine cmdLine, ExecuteWatchdog watchdog, Executor executor) {
        executor.setExitValues(null);
        executor.setWatchdog(watchdog);

        PumpStreamHandler streamHandler = new PumpStreamHandler(System.out, System.out);
        executor.setStreamHandler(streamHandler);
        try {
            int exitValue = executor.execute(cmdLine);
            logger.error("Exit Value: " + exitValue);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    private Map<String, Object> getOrCreate(String key) {
        Boolean hasOne = true;
        SingleExecutor executor = executorConcurrentMap.get(key);
        if (executor == null) {
            synchronized (this) {
                executor = executorConcurrentMap.get(key);
                if (executor == null) {
                    SingleExecutor newExecutor = SingleExecutor.getInstance();
                    executor = executorConcurrentMap.putIfAbsent(key, newExecutor);
                    if (executor == null) {
                        executor = newExecutor;
                    }
                    hasOne = false;
                }
            }
        }
        Map<String, Object> result = new HashMap<>();
        result.put(EXECUTOR, executor);
        result.put(HAS_ALREADY, hasOne);
        return result;
    }

    public void stopRunningCommand(String cid) {
        SingleExecutor singleExecutor = executorConcurrentMap.get(cid);
        Executor executor = null;
        if(singleExecutor != null) {
            executor = singleExecutor.getExecutor();
            executor.getWatchdog().destroyProcess();
        }
    }
}
