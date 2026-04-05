package com.rohith.classes.Interfaces;

public class car implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("put brake");
    }

    public void start() {
        System.out.println("Start car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }

    @Override
    public void acc() {
        System.out.println("fast car");
    }

    @Override
    public void power(int power) {
        System.out.println("Car's total power "+power);
    }
}
