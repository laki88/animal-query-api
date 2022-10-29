package com.singtel.animalqueryapi.animals;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BirdTest {

    Bird bird;

    @Before
    public void before(){
        bird = new Bird();
    }

    @Test
    public void testSing() {
        Assertions.assertEquals("I am singing", bird.performSing());
    }
}
