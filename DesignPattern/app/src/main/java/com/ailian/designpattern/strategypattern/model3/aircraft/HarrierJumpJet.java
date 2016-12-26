package com.ailian.designpattern.strategypattern.model3.aircraft;

import com.ailian.designpattern.strategypattern.model3.character.SupersonicFlight;
import com.ailian.designpattern.strategypattern.model3.takeoff.VerticalTakeoff;

/**
 * 鹞式战斗机
 * Created by Ailian on 16/12/26.
 */

public class HarrierJumpJet extends BaseAircraft {

    public HarrierJumpJet() {
        takeOffInterface = new VerticalTakeoff();
        flightInterface = new SupersonicFlight();
    }
}
