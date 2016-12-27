package com.ailian.designpattern.factorypattern.factoryMethod;

/**
 * Created by Ailian on 16/12/26.
 */

public class FileLogger implements Logger {
    @Override
    public String writeLog() {
        return "日志写到文件中";
    }
}
