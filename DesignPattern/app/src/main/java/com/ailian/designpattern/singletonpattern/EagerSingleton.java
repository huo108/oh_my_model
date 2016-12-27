package com.ailian.designpattern.singletonpattern;

/**
 * 饿汉式
 * Created by Ailian on 16/12/27.
 */

public class EagerSingleton {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton newInstance() {
        return eagerSingleton;
    }

}
