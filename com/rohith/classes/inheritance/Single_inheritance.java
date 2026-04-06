package com.rohith.classes.inheritance;

import javax.xml.namespace.QName;

class Device{
    String name;
    int price;
    Device(){
        this.name = "Default Device";
        this.price = 1000;
    }
    Device(String name, int price){
        this.name = name;
        this.price = price;
    }
}
class Phone extends Device{
    String model;
    int rupees;
    Phone(){
        super();
        this.model = "Default Phone";
        this.rupees = 1231;
    }
    Phone(String model,int rupees){
        super(model,rupees);
        this.model = model;
        this.rupees = rupees;
    }

}
public class Single_inheritance {
   public static void main(String[] args) {
      Phone redmi = new Phone();
       System.out.println(redmi.name+" "+redmi.price);
       System.out.println(redmi.model+" "+redmi.rupees);
    }
}
