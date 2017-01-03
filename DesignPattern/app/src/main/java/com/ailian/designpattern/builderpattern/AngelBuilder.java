package com.ailian.designpattern.builderpattern;

/**
 * Created by Ailian on 17/1/3.
 */

public class AngelBuilder extends ActorBuilder {
    @Override
    public String buildType() {
        return "天使";
    }

    @Override
    public String buildSex() {
        return "nv";
    }

    @Override
    public String buildFace() {
        return "butterfly";
    }

    @Override
    public String buildCostume() {
        return "我可得会啊";
    }

    @Override
    public String buildHairstyle() {
        return "长发";
    }
}
