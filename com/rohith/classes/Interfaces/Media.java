package com.rohith.classes.Interfaces;

public class Media implements Music{
    @Override
    public void play(){
        System.out.println("Music is playing");
    }
    @Override
    public void start(){
        System.out.println("Music Start");
    }
    @Override
    public void stop(){
        System.out.println("Music Stops");
    }
    @Override
    public void resume(){
        System.out.println("Music Resumes");
    }
}
