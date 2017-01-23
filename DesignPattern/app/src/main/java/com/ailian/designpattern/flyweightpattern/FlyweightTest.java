package com.ailian.designpattern.flyweightpattern;

/**
 * Created by Ailian on 17/1/22.
 */

public class FlyweightTest {

    public static void main(String[] args){
        IgoChessFactory igoChessFactory = IgoChessFactory.newInstance();
        IgoChessman black1,black2,white1,white2,white3;

        black1 = igoChessFactory.getIgoChess("black");
        black2 = igoChessFactory.getIgoChess("black");
        white1 = igoChessFactory.getIgoChess("white");
        white2 = igoChessFactory.getIgoChess("white");
        white3 = igoChessFactory.getIgoChess("white");

        black1.display(new Coordinates(10,5));
        black2.display(new Coordinates(15,4));
        white1.display(new Coordinates(12,4));
        white2.display(new Coordinates(16,3));
        white3.display(new Coordinates(123,54));

    }

}
