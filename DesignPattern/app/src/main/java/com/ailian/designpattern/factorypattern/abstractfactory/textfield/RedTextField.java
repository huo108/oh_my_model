package com.ailian.designpattern.factorypattern.abstractfactory.textfield;

/**
 * Created by Ailian on 16/12/27.
 */

public class RedTextField implements BaseTextField {
    @Override
    public String display() {
        return "red_textfield";
    }
}
