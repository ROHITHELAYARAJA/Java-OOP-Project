package com.rohith.classes.access;

public class B {
    static void main() {
        A ferrrari = new A();
//        ferrrari.getPrice(86427);
        System.out.println("Initial price is  "+ferrrari.getPrice(86427));
        ferrrari.setPrice(100353);
        ferrrari.finalsetprice();
    }
}
