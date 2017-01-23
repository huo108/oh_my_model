package com.ailian.designpattern.flyweightpattern;

import android.os.Bundle;

import java.util.Hashtable;

/**
 * Created by Ailian on 17/1/22.
 */
public class IgoChessFactory {

    private static IgoChessFactory igoChessFactory = new IgoChessFactory();
    private static Hashtable ht;

    private IgoChessFactory() {
        ht = new Hashtable();
        IgoChessman whiteChess, blackChess;
        whiteChess = new WhiteIgoChessman();
        ht.put("white", whiteChess);
        blackChess = new BlackIgoChessman();
        ht.put("black", blackChess);
    }

    public static IgoChessFactory newInstance() {
        return igoChessFactory;
    }

    public IgoChessman getIgoChess(String key) {
        return (IgoChessman) ht.get(key);
    }

}
