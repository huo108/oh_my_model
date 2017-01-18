package com.ailian.designpattern.bridgepattern;

/**
 * Created by Ailian on 17/1/18.
 */

public abstract class System {
    protected Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract void printSystem();
}
