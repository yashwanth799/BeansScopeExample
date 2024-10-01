package com.ivoyant;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }

    public Engine getEngine() {
        return engine;
    }
}
