package com.ailian.designpattern.simplefactory;

/**
 * Created by Ailian on 16/12/26.
 */

public class ChartFactory {

    public static Chart getChart(String type) {

        if ("line".equals(type)) {
            return new LineChart();
        }

        if ("pie".equals(type)) {
            return new PieChart();
        }

        if ("histogram".equals(type)) {
            return new HistogramChart();
        }

        return null;
    }

}
