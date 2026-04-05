package com.rohith.classes.polymorphism;

public class objectPrint {
//    int x=10;
//    objectPrint(){
//        this.x = 90;
//    }
    @Override
    public String toString(){
        return "@32k sfk";
    }
    static void main() {
        objectPrint obj = new objectPrint();
        System.out.println(obj);
    }
}
