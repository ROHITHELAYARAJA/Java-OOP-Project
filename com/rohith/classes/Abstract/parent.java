package com.rohith.classes.Abstract;

public abstract class parent {

    int member;
    static final int value = 3232;

    public parent(int member) {
        this.member = member;
    }
    static void normal(){
        System.out.println("parent normal");
    }

    abstract void career();
    abstract void msg();
}
