package com.ailian.designpattern.strategypattern.mode1.swim;

/**
 * Created by Ailian on 16/12/23.
 */

public class Slow implements SwimInterface {
    @Override
    public void swim() {
        System.out.println("Swim Slow .....");
    }
}
