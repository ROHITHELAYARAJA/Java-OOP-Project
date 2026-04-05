package com.rohith.classes.StaticExample;


public class InnerClass {

   static class test {
        String name;

        public test(String name) {
            this.name = name;
        }
       @Override
       public String toString(){
           return "ok5220395";
       }
    }


    static void main(String[] args) {
//       test a = new test("Rohith");
//       test b = new test("Krish");
//        System.out.println(a.name);
//        System.out.println(b.name);
//             without static we need to create an object for the outer class and with the reference of
//             the outer class refernce we need to an object to inner class to acces via object because the
//             inner and outer class are no-static context
//        InnerClass obj = new InnerClass();
//        InnerClass.test a = obj.new test("Rohith");
//        System.out.println(a.name);

        test a = new test("Rohith");
        System.out.println(a);
        // System = it is a class in java
        // out = it is a static variable in the System class out->PrintStream Object and store the printing object
        // println = method inside the printStream class
//        System.out  ───► PrintStream object (printer) it point to the printer for

//        Heap Memory:
//  [ PrintStream Object ]  ← actual printer
//        System.out
//     ↓
//        (reference to that object I mean the PrintStream Object )
//        println("Rohith")
//     ↓
//        prints on cons
    }
}