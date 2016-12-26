package com.ailian.designpattern.strategypattern.model3.aircraft;

import com.ailian.designpattern.strategypattern.model3.takeoff.VerticalTakeoff;
import com.ailian.designpattern.strategypattern.model3.character.SubsonicFlight;

/**
 * 直升机
 * Created by Ailian on 16/12/26.
 */

public class Helicopter extends BaseAircraft {

    public Helicopter() {
        takeOffInterface = new VerticalTakeoff();
        flightInterface = new SubsonicFlight();
    }

}
