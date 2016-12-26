package com.ailian.designpattern.strategypattern.model3.aircraft;

import com.ailian.designpattern.strategypattern.model3.character.SupersonicFlight;
import com.ailian.designpattern.strategypattern.model3.takeoff.LongTakeoff;

/**
 * 歼击机
 * Created by Ailian on 16/12/26.
 */

public class Fighter extends BaseAircraft {

    public Fighter() {
        takeOffInterface = new LongTakeoff();
        flightInterface = new SupersonicFlight();
    }
}
