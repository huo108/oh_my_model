package com.ailian.designpattern.strategypattern.mode1;

import com.ailian.designpattern.strategypattern.mode1.color.Red;
import com.ailian.designpattern.strategypattern.mode1.swim.Slow;

/**
 * Created by Ailian on 16/12/23.
 */

public class RedDuck extends BaseDuck {

    public RedDuck() {
        colorInterface = new Red();
        swimInterface = new Slow();
    }

    @Override
    public void display() {
        System.out.println("I am sleeping ....");
    }
}
