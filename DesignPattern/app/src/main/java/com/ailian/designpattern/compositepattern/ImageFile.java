package com.ailian.designpattern.compositepattern;

/**
 * Created by Ailian on 17/1/19.
 */

public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持该文件格式...");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持该文件格式...");
    }

    @Override
    public AbstractFile getChild(int position) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println(name + "被杀毒...");
    }
}
