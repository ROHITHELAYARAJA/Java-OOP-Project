package com.rohith.classes.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine acc");
    }

    @Override
    public void power(int pow) {
        System.out.println("Power Engine's power"+pow);
    }
}
