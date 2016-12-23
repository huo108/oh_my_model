package com.ailian.designpattern.strategypattern.mode1;

/**
 * Created by Ailian on 16/12/23.
 */

public class DuckTest {

    public static void main(String[] args) {
        BaseDuck redDuck = new RedDuck();
        redDuck.swim();
        redDuck.say();
        redDuck.color();
        redDuck.display();

        BaseDuck blackDuck = new BlackDuck();
        blackDuck.swim();
        blackDuck.say();
        blackDuck.color();
        blackDuck.display();
    }

}
