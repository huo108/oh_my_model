package com.ailian.designpattern.facadepattern;

/**
 * Created by Ailian on 17/1/20.
 */

public class FileReader {
    public String reader(String content) {
        System.out.println("读取加密前文件内容:" + content);
        return content;
    }
}
