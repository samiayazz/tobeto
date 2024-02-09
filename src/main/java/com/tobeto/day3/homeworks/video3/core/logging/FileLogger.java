package com.tobeto.day3.homeworks.video3.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya log'landı: " + data);
    }
}
