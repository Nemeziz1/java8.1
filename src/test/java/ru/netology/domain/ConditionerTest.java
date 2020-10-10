package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 10;
        int expectedCurrentTemperature = 11;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(3);
        conditioner.setMaxTemperature(25);
        int currentTemperature = 22;
        int expectedCurrentTemperature = 21;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureOutside() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(20);
        int currentTemperature = 21;
        int expectedCurrentTemperature = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureOutside() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        int currentTemperature = 9;
        int expectedCurrentTemperature = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureEqual() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(20);
        int currentTemperature = 20;
        int expectedCurrentTemperature = 20;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureEqual() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        int currentTemperature = 0;
        int expectedCurrentTemperature = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expectedCurrentTemperature, conditioner.getCurrentTemperature());
    }

}