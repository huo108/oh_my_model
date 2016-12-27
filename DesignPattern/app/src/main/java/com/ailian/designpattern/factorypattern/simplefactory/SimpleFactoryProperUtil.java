package com.ailian.designpattern.factorypattern.simplefactory;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Ailian on 16/12/26.
 */

public class SimpleFactoryProperUtil {

    public static String getProperties(Context c){
        Properties props = new Properties();
        try {
            //方法一：通过activity中的context攻取setting.properties的FileInputStream
            InputStream in = c.getAssets().open("simpleFactory.properties");
            //方法二：通过class获取setting.properties的FileInputStream
            //InputStream in = PropertiesUtill.class.getResourceAsStream("/assets/  setting.properties "));
            props.load(in);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return props.getProperty("chart_class");
    }

}
