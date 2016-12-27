package com.ailian.designpattern.singletonpattern;

/**
 * Created by Ailian on 16/12/27.
 */

public class IoDHSingleton {

    private IoDHSingleton() {
    }

    private static class HodlerClass {
        private final static IoDHSingleton ioDHSingleton = new IoDHSingleton();
    }

    public static IoDHSingleton newInstance() {
        return HodlerClass.ioDHSingleton;
    }

}
