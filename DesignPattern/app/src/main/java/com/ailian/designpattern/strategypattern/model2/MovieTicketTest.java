package com.ailian.designpattern.strategypattern.model2;

import com.ailian.designpattern.strategypattern.model2.calcula.CalculactionInfterface;
import com.ailian.designpattern.strategypattern.model2.calcula.ChridenTicket;
import com.ailian.designpattern.strategypattern.model2.calcula.StudentTicket;
import com.ailian.designpattern.strategypattern.model2.calcula.VipTicket;

/**
 * Created by Ailian on 16/12/26.
 */

public class MovieTicketTest {

    public static void main(String[] args) {
        double price = 80;
        MovieTicket movieTicket = new MovieTicket();

        CalculactionInfterface studentDal = new StudentTicket();
        movieTicket.setCalculactionInfterface(studentDal);
        System.out.println("Student price ===== " + movieTicket.getResult(price));

        CalculactionInfterface vipDal = new VipTicket();
        movieTicket.setCalculactionInfterface(vipDal);
        System.out.println("VIP price ===== " + movieTicket.getResult(price));

        CalculactionInfterface chridenDal = new ChridenTicket();
        movieTicket.setCalculactionInfterface(chridenDal);
        System.out.println("Chriden price ===== " + movieTicket.getResult(price));
    }

}
