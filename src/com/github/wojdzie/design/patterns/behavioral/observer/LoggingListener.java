package com.github.wojdzie.design.patterns.behavioral.observer;

import java.io.File;

public class LoggingListener implements EventListener {

    private final File log;

    public LoggingListener(File log) {
        this.log = log;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
