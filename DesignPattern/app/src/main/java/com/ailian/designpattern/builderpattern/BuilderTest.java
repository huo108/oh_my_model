package com.ailian.designpattern.builderpattern;

import com.ailian.designpattern.util.BaseXml;
import com.ailian.designpattern.util.ObjectXml;

/**
 * 建造者模式
 * Created by Ailian on 17/1/3.
 */
public class BuilderTest {

    public static void main(String[] args) {
        BaseXml<ActorBuilder> baseXml = new ObjectXml();
        ActorBuilder ab = baseXml.getXmlNodeResult("actorBuilder");
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab);
        System.out.println("Type===" + actor.getType());
        System.out.println("Sex===" + actor.getSex());
        System.out.println("Costume===" + actor.getCostume());
        System.out.println("Face===" + actor.getFace());
        System.out.println("Hairstyle===" + actor.getHairstyle());
    }

}
