package com.ailian.designpattern.util;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by Ailian on 16/12/26.
 */

public class StringXml extends BaseXml {

    public StringXml() {
        super();
    }

    @Override
    public String getXmlNodeResult(String nodeName) {
        NodeList nl = doc.getElementsByTagName(nodeName);
        Node classNode = nl.item(0).getFirstChild();
        String cName = classNode.getNodeValue();
        return cName;
    }
}
