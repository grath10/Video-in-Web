package com.june.video.domain;

import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.Executor;

public class SingleExecutor {
    private Executor executor;

    private SingleExecutor() {
        this.executor = new DefaultExecutor();
    }

    public static SingleExecutor getInstance() {
        return SingleExecutorHolder.instance;
    }

    public Executor getExecutor() {
        return executor;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    private static class SingleExecutorHolder {
        private static SingleExecutor instance = new SingleExecutor();
    }
}
