package org.example;

import java.util.Objects;

public class Car {
    @Override
    public String toString() {
        return "Car" +
                "speed=" + speed +
                "model=" + modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Objects.equals(object, car.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, speed);
    }

    Object object;
    //   public class Car {
    static String modelName = "asdbkh";
    private int speed;

    public static String getModelName() {
        return modelName;
    }

    public static void setModelName(String modelName) {
        modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

