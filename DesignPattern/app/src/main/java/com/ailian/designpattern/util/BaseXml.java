package com.ailian.designpattern.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Ailian on 16/12/26.
 */

public abstract class BaseXml<T> {

    protected Document doc;

    public BaseXml() {
        getXml();
    }

    public abstract T getXmlNodeResult(String nodeName);

    protected void getXml(){
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            doc = builder.parse(new File("config.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
