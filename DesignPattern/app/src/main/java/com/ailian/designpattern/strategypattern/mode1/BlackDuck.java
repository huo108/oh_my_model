package com.ailian.designpattern.strategypattern.mode1;

import com.ailian.designpattern.strategypattern.mode1.color.Black;
import com.ailian.designpattern.strategypattern.mode1.swim.Fast;

/**
 * Created by Ailian on 16/12/23.
 */

public class BlackDuck extends BaseDuck {

    public BlackDuck() {
        colorInterface = new Black();
        swimInterface = new Fast();
    }

    @Override
    public void display() {
        System.out.println("I am ducking");
    }
}
