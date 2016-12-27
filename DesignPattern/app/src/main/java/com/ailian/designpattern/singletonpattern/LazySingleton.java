package com.ailian.designpattern.singletonpattern;

/**
 * 双重检查锁定
 * 懒汉式
 * Created by Ailian on 16/12/27.
 */

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton newInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null){//双重检查锁定
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
