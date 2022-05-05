package com.github.wojdzie.design.patterns.behavioral.observer;

import java.io.File;

public class EmailAlertsListener implements EventListener {

    private final String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
