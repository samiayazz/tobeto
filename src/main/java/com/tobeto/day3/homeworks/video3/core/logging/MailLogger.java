package com.tobeto.day3.homeworks.video3.core.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi: " + data);
    }
}
