package com.ailian.designpattern.strategypattern.model2;

import com.ailian.designpattern.strategypattern.model2.calcula.CalculactionInfterface;

/**
 * Created by Ailian on 16/12/26.
 */

public class MovieTicket {

    public void setCalculactionInfterface(CalculactionInfterface calculactionInfterface) {
        this.calculactionInfterface = calculactionInfterface;
    }

    private CalculactionInfterface calculactionInfterface;

    public double getResult(double price) {
        if (calculactionInfterface != null)
            return calculactionInfterface.getResult(price);
        return price;
    }

}
