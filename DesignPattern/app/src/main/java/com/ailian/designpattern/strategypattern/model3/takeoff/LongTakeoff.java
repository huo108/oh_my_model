package com.ailian.designpattern.strategypattern.model3.takeoff;

import com.ailian.designpattern.strategypattern.model3.takeoff.TakeOffInterface;

/**
 * Created by Ailian on 16/12/26.
 */

public class LongTakeoff implements TakeOffInterface{
    @Override
    public String takeoff() {
        return "长距离起飞";
    }
}
