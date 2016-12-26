package com.ailian.designpattern.strategypattern.model3.character;

import com.ailian.designpattern.strategypattern.model3.character.FlightInterface;

/**
 * Created by Ailian on 16/12/26.
 */

public class SubsonicFlight implements FlightInterface{

    @Override
    public String flightCharacter() {
        return "亚音速飞行";
    }
}
