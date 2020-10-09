package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature)
            return;
        if (currentTemperature < minTemperature)
            return;
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature)
            return;
        this.currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature)
            return;
        this.currentTemperature = currentTemperature - 1;
    }
}
