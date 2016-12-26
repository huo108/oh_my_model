package com.ailian.designpattern.strategypattern.model3.takeoff;

import com.ailian.designpattern.strategypattern.model3.takeoff.TakeOffInterface;

/**
 * Created by Ailian on 16/12/26.
 */

public class VerticalTakeoff implements TakeOffInterface {
    @Override
    public String takeoff() {
        return "垂直起飞";
    }
}
