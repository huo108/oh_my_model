package com.ailian.designpattern.strategypattern.model2.calcula;

/**
 * Created by Ailian on 16/12/26.
 */

public class ChridenTicket implements CalculactionInfterface {
    @Override
    public double getResult(double price) {
        if (price >= 20)
            return price - 10;
        else
            return price;
    }
}
