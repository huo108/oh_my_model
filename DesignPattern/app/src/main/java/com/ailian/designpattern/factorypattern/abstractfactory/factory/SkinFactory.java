package com.ailian.designpattern.factorypattern.abstractfactory.factory;

import com.ailian.designpattern.factorypattern.abstractfactory.button.BaseButton;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.BaseTextField;

/**
 * Created by Ailian on 16/12/27.
 */

public interface SkinFactory {

    BaseButton createButton();

    BaseTextField createTextField();

}
