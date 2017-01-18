package com.ailian.designpattern.bridgepattern;

import com.ailian.designpattern.util.BaseXml;
import com.ailian.designpattern.util.ObjectXml;

/**
 * Created by Ailian on 17/1/18.
 */

public class BridgeTest {

    public static void main(String[] args){
        BaseXml<Image> imageBaseXml = new ObjectXml();
        BaseXml<System> systemBaseXml = new ObjectXml();
        Image image = imageBaseXml.getXmlNodeResult("imageNode");
        System system = systemBaseXml.getXmlNodeResult("systemNode");
        system.setImage(image);
        system.printSystem();
    }

}
