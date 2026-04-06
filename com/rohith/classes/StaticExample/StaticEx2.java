package com.rohith.classes.StaticExample;

public class StaticEx2 {
    int x = 10;
    static {
        System.out.println("static block is first executed");
    }
    static void fun(){
        StaticEx2 object = new StaticEx2();
        System.out.println(object.x);
        // a non-static variable inside static cannot be accesed soo
//        we need to create an object to acces inside the non-static variable context
        object.greeting();
        System.out.println("fun panro");
    }
    void greeting(){
        fun();
        System.out.println("Hello World");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Memory erased");
    }

    public static void main(String args[]) {
        StaticEx2 obj = new StaticEx2();
//        obj.greeting();
        obj = null;
        System.gc();// calling jvm like this hey jvm if possible remove the unused objects
        System.out.println("End of main");

//        StaticEx2.main(); stack overflow error

    }
}
