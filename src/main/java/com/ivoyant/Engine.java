package com.ivoyant;

public class Engine {

    private final String name;

    public Engine(String name) {
        this.name = name;
        System.out.println(name + "Created");
    }

    public void start() {
        System.out.println("Engine started");
    }
}
