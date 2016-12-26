package com.ailian.designpattern.simplefactory;

/**
 * Created by Ailian on 16/12/26.
 */

public class SimpleFanctoryTest {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        System.out.println(chart.display());
    }

}
