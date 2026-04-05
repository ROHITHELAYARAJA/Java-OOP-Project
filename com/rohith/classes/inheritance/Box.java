package com.rohith.classes.inheritance;

public class Box {
   double l;
   double h;
   double w;
   private int rating;
   public int getL(){
       return rating;
   }
    public void setRating(int rating){
        this.rating = rating;
    }
   Box(){
       this.l = -1;
       this.h = -1;
       this.w = -1;
   }
   static void msg(){
       System.out.println("Hii I am Box class");
   }
   Box(double side){
       this.l = side;
       this.h = side;
       this.w = side;
   }

   Box(double length,double height,double width){
       super();
       this.l = length;
       this.h = height;
       this.w = width;
   }
   Box(Box old){
       this.l = old.l;
       this.h = old.h;
       this.w = old.w;
   }

   public  static  void info(){
       System.out.println("Running the Box");
   }
}
