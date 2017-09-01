package com.kodilla.patterns.singleton;

public final class Logger {
    private static Logger settingLoggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance(){
        if(settingLoggerInstance == null){
            settingLoggerInstance = new Logger();
        }
        return settingLoggerInstance;
    }

    public void log(final String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}