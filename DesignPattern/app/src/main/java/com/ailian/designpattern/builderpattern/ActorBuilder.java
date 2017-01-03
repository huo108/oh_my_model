package com.ailian.designpattern.builderpattern;

/**
 * Created by Ailian on 17/1/3.
 */

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public Actor createActor() {
        actor.setType(buildType());
        actor.setSex(buildSex());
        actor.setFace(buildFace());
        actor.setCostume(buildCostume());
        actor.setHairstyle(buildHairstyle());
        return actor;
    }

    public abstract String buildType();

    public abstract String buildSex();

    public abstract String buildFace();

    public abstract String buildCostume();

    public abstract String buildHairstyle();

}
