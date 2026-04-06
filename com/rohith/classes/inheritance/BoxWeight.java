package com.rohith.classes.inheritance;

public class BoxWeight extends Box{
    double weight;
    int star;
    public BoxWeight(){
        this.weight = 12;
    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // call the parent class constructor
        System.out.println("Super Class Accessing"+" "+super.h);
        this.weight = weight;
    }
//    @Override
    static void msg(){
        System.out.println("Hii I am Box Weight class");
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(int rating,int star){
        super(rating);
        this.star = star;
    }
    void display(){
        System.out.println("The box Class Rating is "+getL());
        System.out.println("The box weight Class Star is "+star);
    }

    static void main() {
        BoxWeight b = new BoxWeight(3, -55, 2, 5);
        System.out.println(b.h);
        BoxWeight b2 = new BoxWeight(5,19);
        b2.setRating(8731);
        b2.display();


    }
}
