package com.june.video.utils;

import org.apache.commons.exec.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class CommandUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommandUtils.class);

    public static void runFFmpegCmd(String srcUrl, String dstUrl) {
        CommandLine cmdLine = new CommandLine("ffmpeg");
        cmdLine.addArgument("-i");
        cmdLine.addArgument("${src}");
        cmdLine.addArgument("-q");
        cmdLine.addArgument("4");
        cmdLine.addArgument("-f");
        cmdLine.addArgument("mpegts");
        cmdLine.addArgument("-codec:v");
        cmdLine.addArgument("mpeg1video");
        cmdLine.addArgument("${dest}");

        Map<String, String> map = new HashMap();
        map.put("src", srcUrl);
        map.put("dest", dstUrl);

        cmdLine.setSubstitutionMap(map);

        ExecuteWatchdog watchdog = new ExecuteWatchdog(60000);
        Executor executor = new DefaultExecutor();
        executor.setExitValues(null);
        executor.setWatchdog(watchdog);

        PumpStreamHandler streamHandler = new PumpStreamHandler(System.out, System.out);

        executor.setStreamHandler(streamHandler);
        try {
            executor.execute(cmdLine);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
