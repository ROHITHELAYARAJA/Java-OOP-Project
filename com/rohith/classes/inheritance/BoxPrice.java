package com.rohith.classes.inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        super();
        this.price = 213;
    }
    BoxPrice(BoxPrice other){
        this.price = other.price;
    }
    BoxPrice(double side , double weight,double rs){
        super(side,weight);
        this.price = rs;
    }
}
