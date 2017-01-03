package com.ailian.designpattern.prototypepattern;

/**
 * 原型模式
 * Created by Ailian on 16/12/28.
 */

public class PrototypeTest {

    public static void main(String[] args) {
        Attachment attachment = new Attachment();
        attachment.setName("hello kugou");
        ShadowWeeklyLog swl1 = new ShadowWeeklyLog();
        swl1.setAttachment(attachment);
        swl1.setContent("my name is prototype");
        swl1.setDate("2016-12-28");
        swl1.setName("周报一");
        ShadowWeeklyLog swl2 = swl1.clone();

        System.out.println(swl1.getName() == swl2.getName());
        System.out.println(swl1.getAttachment() == swl2.getAttachment());

        DeepWeeklyLog dwl1 = new DeepWeeklyLog();
        dwl1.setAttachment(attachment);
        dwl1.setName("周报2");
        dwl1.setDate("2016-12-12");
        dwl1.setContent("my name is prototype2");

        DeepWeeklyLog dwl2 = dwl1.clone();

        System.out.println(dwl1.getName() == dwl2.getName());
        System.out.println(dwl1.getAttachment() == dwl2.getAttachment());
    }

}
