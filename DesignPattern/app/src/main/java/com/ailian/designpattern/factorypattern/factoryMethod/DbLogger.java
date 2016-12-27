package com.ailian.designpattern.factorypattern.factoryMethod;

/**
 * Created by Ailian on 16/12/26.
 */

public class DbLogger implements Logger {
    @Override
    public String writeLog() {
        return "日志写到DB里面";
    }
}
