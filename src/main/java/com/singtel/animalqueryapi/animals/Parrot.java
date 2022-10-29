package com.singtel.animalqueryapi.animals;

import com.singtel.animalqueryapi.animals.behaviours.SingBehavior;

public class Parrot extends Bird {
    private Animal[] nearBySounds = new Animal[2];

    public void setSingBehavior(SingBehavior singBehavior) {
            String firstSound = nearBySounds[0].performSing();
            String secondSound = nearBySounds.length == 2? nearBySounds[1].performSing() : "";
            if(!firstSound.isEmpty() && secondSound.isEmpty()) {
                this.singBehavior = nearBySounds[0].getSingBehavior();
            } else if(firstSound.isEmpty() && !secondSound.isEmpty()) {
                this.singBehavior = nearBySounds[1].getSingBehavior();
            } else if(!firstSound.isEmpty()) {
                this.singBehavior = nearBySounds[0].getSingBehavior(); // Assuming priority given to first animal
            }
            this.singBehavior = singBehavior;
    }

    public void setNearBySounds(Animal[] nearBySounds) {
        this.nearBySounds = nearBySounds;
    }
}
