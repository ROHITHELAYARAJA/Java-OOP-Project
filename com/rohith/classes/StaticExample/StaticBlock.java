package com.rohith.classes.StaticExample;

public class StaticBlock {
    // method area is an shared memory region to class level data like static variable and methods
    static int a=1;
    static int b=2;
    static {
        // it will run only once when the first object is created i.e when the class is loaded for the first time
        System.out.println("I am static");
        b *=7;
    }

    static void main() {
        StaticBlock a = new StaticBlock();
        System.out.println(StaticBlock.b+" "+StaticBlock.a);
        StaticBlock.b+=42;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock q = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
