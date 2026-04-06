package com.rohith.classes.Interfaces;

import java.util.Scanner;

public class NiceCar {
    private Engine engine;
    private Music music = new Media();
    public NiceCar(){
        engine = new PowerEngine();
    }
//    public NiceCar(Engine engine){
//        this.engine = engine;
//    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void power(int pow){
        engine.power(pow);
    }
    public void play(){
        music.play();
    }
    public void stopplay(){
        music.stop();
    }
    public void startplay(){
        music.play();
    }
    public void resume(){
        music.resume();
    }

    public void Upgrade(Engine engine){
        this.engine = engine;
        Scanner x = new Scanner(System.in);
    }
}
