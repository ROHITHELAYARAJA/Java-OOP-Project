package com.rohith.classes.exceptionHandling;

public class Demo {
    static void main() {
     try{
         Main.divde(6,0);
     }
     catch(Exception e){
         System.out.println("Error");
     }
    }
}
