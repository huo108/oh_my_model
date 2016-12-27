package com.ailian.designpattern.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


/**
 * Created by Ailian on 16/12/26.
 */

public class ObjectXml extends BaseXml {

    public ObjectXml() {
        super();
    }

    /**
     * @param nodeName 节点名称
     * @return
     */
    @Override
    public Object getXmlNodeResult(String nodeName) {
        try {
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName(nodeName);
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
