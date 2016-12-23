package com.ailian.designpattern.strategypattern.mode1;

import com.ailian.designpattern.strategypattern.mode1.color.ColorInterface;
import com.ailian.designpattern.strategypattern.mode1.swim.SwimInterface;

/**
 * 策略模式
 * Created by Ailian on 16/12/23.
 */
public abstract class BaseDuck {

    protected ColorInterface colorInterface;
    protected SwimInterface swimInterface;

    public void say() {
        System.out.println("-----gagaga-----");
    }

    public void swim() {
        if (swimInterface != null)
            swimInterface.swim();
    }

    public void color() {
        if (colorInterface != null)
            colorInterface.color();
    }

    public abstract void display();
}
