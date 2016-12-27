package com.ailian.designpattern.factorypattern.simplefactory;

/**
 * 饼状图
 * Created by Ailian on 16/12/26.
 */

public class PieChart implements Chart {
    @Override
    public String display() {
        return "我是饼状图";
    }
}
