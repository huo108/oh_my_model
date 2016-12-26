package com.ailian.designpattern.strategypattern.model3.aircraft;

import com.ailian.designpattern.strategypattern.model3.character.SubsonicFlight;
import com.ailian.designpattern.strategypattern.model3.takeoff.LongTakeoff;

/**
 * 客机
 * Created by Ailian on 16/12/26.
 */

public class Aircraft extends BaseAircraft {

    public Aircraft() {
        takeOffInterface = new LongTakeoff();
        flightInterface = new SubsonicFlight();
    }

}
