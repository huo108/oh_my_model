package com.ailian.designpattern.factorypattern.abstractfactory;

import com.ailian.designpattern.factorypattern.abstractfactory.button.BaseButton;
import com.ailian.designpattern.factorypattern.abstractfactory.factory.SkinFactory;
import com.ailian.designpattern.factorypattern.abstractfactory.textfield.BaseTextField;
import com.ailian.designpattern.util.BaseXml;
import com.ailian.designpattern.util.ObjectXml;

/**
 * Created by Ailian on 16/12/27.
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {
//        SkinFactory skinFactory = new BlueFactory();
        BaseXml<SkinFactory> baseXml = new ObjectXml();
        SkinFactory skinFactory = baseXml.getXmlNodeResult("abstractFactory");
        BaseTextField baseTextField = skinFactory.createTextField();
        BaseButton baseButton = skinFactory.createButton();
        System.out.println(baseTextField.display());
        System.out.println(baseButton.display());
    }

}
