package com.ailian.designpattern.factorypattern.simplefactory;

import com.ailian.designpattern.util.StringXml;
import com.ailian.designpattern.util.BaseXml;

/**
 * Created by Ailian on 16/12/26.
 */

public class SimpleFanctoryTest {

    public static void main(String[] args) {
//        Chart chart = ChartFactory.getChart("pie");
//        System.out.println(chart.display());
        BaseXml<String> baseXml = new StringXml();
        String chartNode = baseXml.getXmlNodeResult("chartNode");
        Chart chart = ChartFactory.getChart(chartNode);
        System.out.println(chart.display());
    }

}
