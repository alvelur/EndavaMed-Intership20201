package com.patterns.creational.p3.case2;

public class SystemConfig {
    private static SystemConfig SINGLE_INSTANCE = null;

    String location;

    private SystemConfig() {}

    private SystemConfig(String location){
        this.location = location;
    }
    public static SystemConfig getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized(SystemConfig.class) {
                SINGLE_INSTANCE = new SystemConfig("COL");
            }
        }
        return SINGLE_INSTANCE;
    }
}
