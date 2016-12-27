package com.ailian.designpattern.factorypattern.abstractfactory.factory;

import com.ailian.designpattern.factorypattern.abstractfactory.button.BaseButton;
import com.ailian.designpattern.factorypattern.abstractfactory.button.BlueButton;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.BaseTextField;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.BlueTextField;

/**
 * Created by Ailian on 16/12/27.
 */

public class BlueFactory implements SkinFactory {

    @Override
    public BaseButton createButton() {
        return new BlueButton();
    }

    @Override
    public BaseTextField createTextField() {
        return new BlueTextField();
    }
}
