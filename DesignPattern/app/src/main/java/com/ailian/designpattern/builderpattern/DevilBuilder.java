package com.ailian.designpattern.builderpattern;

/**
 * Created by Ailian on 17/1/3.
 */

public class DevilBuilder extends ActorBuilder {
    @Override
    public String buildType() {
        return "恶魔";
    }

    @Override
    public String buildSex() {
        return "男";
    }

    @Override
    public String buildFace() {
        return "丑";
    }

    @Override
    public String buildCostume() {
        return "喝酒";
    }

    @Override
    public String buildHairstyle() {
        return "烫头";
    }
}
