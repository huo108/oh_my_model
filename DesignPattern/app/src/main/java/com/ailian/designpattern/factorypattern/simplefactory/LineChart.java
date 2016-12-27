package com.ailian.designpattern.factorypattern.simplefactory;

/**
 * 折线图
 * Created by Ailian on 16/12/26.
 */

public class LineChart implements Chart {
    @Override
    public String display() {
        return "我是折线图";
    }
}
