package com.rohith.classes.SingleTon;

public class Singleton {
//    private int x = 100;
    private Singleton(){
    }
    private  static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return  instance;
    }
    @Override
    public String toString(){
        return "$13176!572";
    }
}
