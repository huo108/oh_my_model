package com.ailian.designpattern.strategypattern.model3.aircraft;

import com.ailian.designpattern.strategypattern.model3.character.FlightInterface;
import com.ailian.designpattern.strategypattern.model3.takeoff.TakeOffInterface;

/**
 * 飞机基类
 * Created by Ailian on 16/12/26.
 */

public class BaseAircraft {

    protected TakeOffInterface takeOffInterface;
    protected FlightInterface flightInterface;
    /**
     * 起飞方式
     * @return
     */
    public String getTakeOffType(){
        return takeOffInterface.takeoff();
    }

    public String flightCharacter(){
        return flightInterface.flightCharacter();
    }


    /**
     * 提供动态修改接口
     * @param flightInterface
     */
    public void setFlightInterface(FlightInterface flightInterface) {
        this.flightInterface = flightInterface;
    }

    /**
     * 提供动态修改接口
     * @param takeOffInterface
     */
    public void setTakeOffInterface(TakeOffInterface takeOffInterface) {
        this.takeOffInterface = takeOffInterface;
    }
}
