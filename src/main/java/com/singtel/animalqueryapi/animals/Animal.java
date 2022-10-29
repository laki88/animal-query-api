package com.singtel.animalqueryapi.animals;

import com.singtel.animalqueryapi.animals.behaviours.SingBehavior;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    protected SingBehavior singBehavior;

    public String performSing() {
        return singBehavior.sing();
    }

    public SingBehavior getSingBehavior() {
        return singBehavior;
    }

    public void setSingBehavior(SingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

    void walk(){
        System.out.println("I am walking");
    }
}
