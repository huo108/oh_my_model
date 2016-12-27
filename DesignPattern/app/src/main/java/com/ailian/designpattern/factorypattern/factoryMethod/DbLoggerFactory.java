package com.ailian.designpattern.factorypattern.factoryMethod;

/**
 * Created by Ailian on 16/12/26.
 */

public class DbLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new DbLogger();
        return logger;
    }
}
