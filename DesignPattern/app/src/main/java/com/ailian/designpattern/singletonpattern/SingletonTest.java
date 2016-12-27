package com.ailian.designpattern.singletonpattern;

/**
 * Created by Ailian on 16/12/27.
 */

public class SingletonTest {

    public static void main(String[] agrs) {
        EagerSingleton es1, es2;
        es1 = EagerSingleton.newInstance();
        es2 = EagerSingleton.newInstance();
        System.out.println("EagerSingleton:"+(es1 == es2));

        LazySingleton ls1, ls2;
        ls1 = LazySingleton.newInstance();
        ls2 = LazySingleton.newInstance();
        System.out.println("LazySingleton:"+(ls1 == ls2));

        IoDHSingleton is1, is2;
        is1 = IoDHSingleton.newInstance();
        is2 = IoDHSingleton.newInstance();
        System.out.println("EagerSingleton:"+(is1 == is2));
    }

}
