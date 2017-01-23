package com.ailian.designpattern.flyweightpattern;

/**
 * Created by Ailian on 17/1/22.
 */

public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色:" + getColor() + ",X坐标:" + coordinates.getX() + ",Y坐标:" + coordinates.getY());
    }
}
