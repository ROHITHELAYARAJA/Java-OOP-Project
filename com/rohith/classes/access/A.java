package com.rohith.classes.access;

public class A {
    private int price = 10;
    String car;

    public int getPrice(int price) {
        return price;
    }
    public void finalsetprice(){
        System.out.println("finalsetprice "+ price);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
