package com.engine;

public class Engine {
	private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine started");
    }
}
