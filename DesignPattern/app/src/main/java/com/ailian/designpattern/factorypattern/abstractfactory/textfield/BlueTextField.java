package com.ailian.designpattern.factorypattern.abstractfactory.textfield;

/**
 * Created by Ailian on 16/12/27.
 */

public class BlueTextField implements BaseTextField {
    @Override
    public String display() {
        return "blue_textfield";
    }
}
