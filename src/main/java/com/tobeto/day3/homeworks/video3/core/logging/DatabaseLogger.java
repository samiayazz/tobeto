package com.tobeto.day3.homeworks.video3.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına log'landı: " + data);
    }
}
