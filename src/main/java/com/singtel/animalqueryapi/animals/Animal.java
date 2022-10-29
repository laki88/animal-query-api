package com.singtel.animalqueryapi.animals;

import com.singtel.animalqueryapi.animals.behaviours.SingBehavior;
import com.singtel.animalqueryapi.animals.behaviours.WalkBehaviour;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    protected SingBehavior singBehavior;

    protected WalkBehaviour walkBehaviour;

    public String performSing() {
        return singBehavior.sing();
    }

    public SingBehavior getSingBehavior() {
        return singBehavior;
    }

    public void setSingBehavior(SingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

}
