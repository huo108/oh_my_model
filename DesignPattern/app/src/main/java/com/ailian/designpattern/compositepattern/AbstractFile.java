package com.ailian.designpattern.compositepattern;

/**
 * Created by Ailian on 17/1/19.
 */

public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int position);

    public abstract void killVirus();

}
