package com.rohith.classes.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric  Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric  Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric  Engine acc");
    }

    @Override
    public void power(int pow) {
        System.out.println("Electric  Engine Power"+pow);
    }


}
