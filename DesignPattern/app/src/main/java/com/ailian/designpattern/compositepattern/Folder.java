package com.ailian.designpattern.compositepattern;

import java.util.ArrayList;

/**
 * Created by Ailian on 17/1/19.
 */

public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> files = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int position) {
        return files.get(position);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        for (AbstractFile file : files){
            file.killVirus();
        }
    }
}
