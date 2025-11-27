package com.car;

import com.engine.Engine;

public class Car {
	private Engine engine; // dependency

    // Constructor for DI
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is running...");
    }
}
