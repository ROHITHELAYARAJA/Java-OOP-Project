package com.rohith.classes.polymorphism;

public class Numbers {
    double sum (int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    String sum(String a,String b){
        return a+b;
    }

    double sum(double a,int b){
        return a+b;
    }
    double sum(int a,double b){
        return a+b;
    }
    public static void main(String [] args){
//        METHO OVERLOADING IN JAVA
//        IT IS THE COMPLIE TIME POLYMORPHISM EXAMPLE
//        WHICH IS METHOD OVER LOADING IN JAVA
        Numbers x = new Numbers();
        System.out.println(x.sum(3,5,7));
        System.out.println(x.sum("hfe","njd"));
        System.out.println(x.sum(3,4));
    }
}
