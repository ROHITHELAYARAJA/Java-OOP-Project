package com.rohith.classes.Abstract;

public class daughter extends parent {
    public daughter(int member) {
        super(member);
    }

    @Override
    void career() {
        System.out.println("Daughter carrer");
    }
   static void normal(){
        System.out.println("daughter normal");
    }
    @Override
    void msg(){
        System.out.println("Daughter msg");
    }
}
