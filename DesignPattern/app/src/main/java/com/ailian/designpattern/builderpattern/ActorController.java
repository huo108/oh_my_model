package com.ailian.designpattern.builderpattern;

/**
 * Created by Ailian on 17/1/3.
 */

public class ActorController {

    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildCostume();
        ab.buildFace();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }

}
