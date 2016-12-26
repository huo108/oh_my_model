package com.ailian.designpattern.strategypattern.model3.character;

import com.ailian.designpattern.strategypattern.model3.character.FlightInterface;

/**
 * Created by Ailian on 16/12/26.
 */

public class SupersonicFlight implements FlightInterface {

    @Override
    public String flightCharacter() {
        return "超音速飞行";
    }
}
