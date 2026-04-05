package com.rohith.classes.Interfaces.Extend;

public class main implements B{
    @Override
    public void fun(){
        System.out.println("fun");
    }
    public void greet(){
        System.out.println("greet");
    }
    public static void main(String[] args) {
        main m = new main();
        m.greet();
        m.fun();
    }
}
