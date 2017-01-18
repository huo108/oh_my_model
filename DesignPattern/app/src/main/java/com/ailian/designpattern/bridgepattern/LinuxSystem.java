package com.ailian.designpattern.bridgepattern;

/**
 * Created by Ailian on 17/1/18.
 */

public class LinuxSystem extends System {
    @Override
    public void printSystem() {
        image.showImage();
        java.lang.System.out.println("我是Linux系统：");
    }
}
