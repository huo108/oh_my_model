package com.ailian.designpattern.factorypattern.abstractfactory.button;

/**
 * Created by Ailian on 16/12/27.
 */

public class RedButton implements BaseButton {
    @Override
    public String display() {
        return "red_button";
    }
}
