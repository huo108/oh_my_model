package com.ailian.designpattern.strategypattern.model3;

import com.ailian.designpattern.strategypattern.model3.aircraft.Aircraft;
import com.ailian.designpattern.strategypattern.model3.aircraft.Fighter;
import com.ailian.designpattern.strategypattern.model3.aircraft.HarrierJumpJet;
import com.ailian.designpattern.strategypattern.model3.aircraft.Helicopter;

/**
 * Created by Ailian on 16/12/26.
 */

public class AircraftTest {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        Aircraft aircraft = new Aircraft();
        Fighter fighter = new Fighter();
        HarrierJumpJet harrierJumpJet = new HarrierJumpJet();
        System.out.println("==直升机==起飞特征：" + helicopter.getTakeOffType() + "==飞行特征：" + helicopter.flightCharacter()+"==");
        System.out.println("==客机==起飞特征：" + aircraft.getTakeOffType() + "==飞行特征：" + aircraft.flightCharacter()+"==");
        System.out.println("==歼击机==起飞特征：" + fighter.getTakeOffType() + "==飞行特征：" + fighter.flightCharacter()+"==");
        System.out.println("==鹞式战斗机==起飞特征：" + harrierJumpJet.getTakeOffType() + "==飞行特征：" + harrierJumpJet.flightCharacter()+"==");
    }
}
