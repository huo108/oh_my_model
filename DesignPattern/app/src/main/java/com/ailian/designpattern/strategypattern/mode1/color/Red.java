package com.ailian.designpattern.strategypattern.mode1.color;

/**
 * Created by Ailian on 16/12/23.
 */

public class Red implements ColorInterface{

    @Override
    public void color() {
        System.out.println("I am red ...");
    }
}
