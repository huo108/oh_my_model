package com.ailian.designpattern.proxypattern;

/**
 * Created by Ailian on 17/1/23.
 */

public class ProxySearch implements Searcher{

    private RealSearch realSearch = new RealSearch();
    private WLog wLog;
    private Authen authen;

    @Override
    public void doSearch() {
        authen();
        realSearch.doSearch();
        log();
    }

    private void log(){
        wLog = new WLog();
        wLog.log();
    }

    private void authen(){
        authen = new Authen();
        authen.authen();
    }

}
