package com.ailian.designpattern.facadepattern;

/**
 * 外观类
 * Created by Ailian on 17/1/20.
 */

public class Facde {

    public void facde() {
        FileReader fileReader = new FileReader();
        FileEncrypt fileEncrypt = new FileEncrypt();
        FileWriter fileWriter = new FileWriter();
        String content = fileReader.reader("hello world");
        String encCont = fileEncrypt.encrypt(content);
        fileWriter.writer(encCont);
    }

}
