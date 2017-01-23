package com.ailian.designpattern.proxypattern;

/**
 * Created by Ailian on 17/1/23.
 */

public class RealSearch implements Searcher{
    @Override
    public void doSearch() {
        System.out.println("我正在搜索内容...");
    }
}
