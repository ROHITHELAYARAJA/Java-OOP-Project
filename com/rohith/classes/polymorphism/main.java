package com.rohith.classes.polymorphism;

public class main {
   public static void main() {
        Shapes s = new Shapes();
        Circle c = new Circle();
        Shapes sq = new Square();
        triangle t = new triangle();

//     refernce = object
//     refernce type say  which one to access = object type define which one to run
//     👉 Java always executes method of OBJECT type at runtime.
//
//      This is called:
//
//     ⭐ Dynamic Method Dispatch
//       Access = refernce variable
//       Execution = object type
        sq.area();
        c.area();
        t.area();
//      I am in square

//     We cannot override if thr method is final then it give an error
    }
}
