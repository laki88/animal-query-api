package com.singtel.animalqueryapi.animals;

import com.singtel.animalqueryapi.animals.behaviours.FlyBehaviour;
import org.springframework.stereotype.Component;

@Component
public class Bird extends Animal {
    private FlyBehaviour flyBehaviour;


    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }


    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }
}
