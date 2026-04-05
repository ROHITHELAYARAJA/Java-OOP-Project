package com.rohith.classes.Interfaces.Extend2;

public class main implements D {
    @Override
    public void fun() {
        System.out.println("jiog42m");
    }

    public static void main(String[] args) {
        main m = new main();
        m.fun();
        m.greet();
    }

    @Override
    public void greet() {
        System.out.println("hello");
    }
}
