package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int expectedMaxTemperature = 30;
        conditioner.setMaxTemperature(expectedMaxTemperature);
        assertEquals(expectedMaxTemperature, conditioner.getMaxTemperature());

        int expectedCurrentTemperature = 18;
        conditioner.increaseCurrentTemperature(expectedCurrentTemperature);
        assertEquals(expectedCurrentTemperature++, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int expectedMinTemperature = -8;
        conditioner.setMinTemperature(expectedMinTemperature);
        assertEquals(expectedMinTemperature, conditioner.getMinTemperature());

        int expectedCurrentTemperature = 4;
        conditioner.decreaseCurrentTemperature(expectedCurrentTemperature);
        assertEquals(expectedCurrentTemperature--, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();

        int expectedMaxTemperature = 30;
        conditioner.setMaxTemperature(expectedMaxTemperature);
        assertEquals(expectedMaxTemperature, conditioner.getMaxTemperature());

        int expectedCurrentTemperature = 31;
        conditioner.increaseCurrentTemperature(expectedCurrentTemperature);
        assertNotEquals(expectedCurrentTemperature, conditioner.getMaxTemperature());
    }

    @Test
    public void decreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();

        int expectedMinTemperature = -20;
        conditioner.setMinTemperature(expectedMinTemperature);
        assertEquals(expectedMinTemperature, conditioner.getMinTemperature());

        int expectedCurrentTemperature = -22;
        conditioner.decreaseCurrentTemperature(expectedCurrentTemperature);
        assertNotEquals(expectedCurrentTemperature, conditioner.getMinTemperature());
    }
}