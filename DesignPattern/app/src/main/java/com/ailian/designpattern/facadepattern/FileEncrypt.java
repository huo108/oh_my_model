package com.ailian.designpattern.facadepattern;

/**
 * Created by Ailian on 17/1/20.
 */

public class FileEncrypt {
    public String encrypt(String content) {
        System.out.println("加密文件内容:" + content);
        return "我是加密后的内容";
    }
}
