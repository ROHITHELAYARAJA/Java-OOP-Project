package com.rohith.classes.exceptionHandling;

public class MyException extends Exception {
    public MyException(String message){
        super(message);
    }

    static void main() {
        MyException x = new MyException("Hello World");
        System.out.println(x.getMessage());
    }

}
