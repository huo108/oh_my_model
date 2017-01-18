package com.ailian.designpattern.bridgepattern;

import java.lang.*;
import java.lang.System;

/**
 * Created by Ailian on 17/1/18.
 */

public class JpgImage implements Image {
    @Override
    public void showImage() {
        System.out.println("显示JPG图片");
    }
}
