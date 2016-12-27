package com.ailian.designpattern.factorypattern.simplefactory;

/**
 * 柱状图
 * Created by Ailian on 16/12/26.
 */

public class HistogramChart implements Chart {

    @Override
    public String display() {
        return "我是柱状图";
    }
}
