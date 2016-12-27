package com.ailian.designpattern.factorypattern.factoryMethod;

/**
 * Created by Ailian on 16/12/26.
 */

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
