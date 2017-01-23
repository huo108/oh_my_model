package com.ailian.designpattern.proxypattern;

/**
 * Created by Ailian on 17/1/23.
 */

public class ProxyTest {

    public static void main(String[] args){
        Searcher searcher = new ProxySearch();
        searcher.doSearch();
    }

}
