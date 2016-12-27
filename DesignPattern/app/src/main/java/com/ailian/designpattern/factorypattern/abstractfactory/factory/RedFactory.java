package com.ailian.designpattern.factorypattern.abstractfactory.factory;

import com.ailian.designpattern.factorypattern.abstractfactory.button.BaseButton;
import com.ailian.designpattern.factorypattern.abstractfactory.button.RedButton;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.BaseTextField;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.RedTextField;

/**
 * Created by Ailian on 16/12/27.
 */

public class RedFactory implements SkinFactory {
    @Override
    public BaseButton createButton() {
        return new RedButton();
    }

    @Override
    public BaseTextField createTextField() {
        return new RedTextField();
    }
}
