package com.ailian.designpattern.strategypattern.model2.calcula;

/**
 * Created by Ailian on 16/12/26.
 */

public class StudentTicket implements CalculactionInfterface {

    @Override
    public double getResult(double price) {
        return price * 0.8;
    }
}
