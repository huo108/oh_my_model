package com.ailian.designpattern.factorypattern.factoryMethod;

import com.ailian.designpattern.util.ObjectXml;
import com.ailian.designpattern.util.BaseXml;

/**
 * Created by Ailian on 16/12/26.
 */

public class FactoryMethodTest {

    public static void main(String[] args) {
//        LoggerFactory loggerFactory = new DbLoggerFactory();//可引入配置文件实现
        BaseXml<LoggerFactory> baseXml = new ObjectXml();
        LoggerFactory loggerFactory = baseXml.getXmlNodeResult("loggerFactory"); //getBean()的返回类型为Object，需要进行强制类型转换
        Logger logger = loggerFactory.createLogger();
        String log = logger.writeLog();
        System.out.println(log);
    }

}
