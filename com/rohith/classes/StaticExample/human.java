package com.rohith.classes.StaticExample;

public class human {
    String name;
    int age;
    int salary;
    boolean married;
    static int  population;
    static void msg(){
        System.out.println("fahh");
//        human x = new human();
//        System.out.println(x.age);
    }
    human(String name, int age, int salary,boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        human.population++;
        msg();
    }
//    human() {
//        // default values
//    }
}
