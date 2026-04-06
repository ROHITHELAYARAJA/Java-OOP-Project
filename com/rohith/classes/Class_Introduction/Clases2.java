package com.rohith.classes.Class_Introduction;

class A{
    final int roll = 1;
    String name = "lg";
    A(String name) {
        this.name = name;
    }
    A(){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obeject Destroyed");
    }
}
public class Clases2 {
    public static void main(String args []) {
        final A a = new A();
        System.out.println(a.name);
        final A b = new A("Kirmada");
        System.out.println(b.name);
        A c ;
        for (int i=0;i<1000000;i++){
          c = new A();
        }
//        a = new A();
//        when non primitive is an final we cannot assign it
//        int a =10;
//        int b =2;
//        swap(a,b);
//        System.out.println(a+" "+b);
//        Integer x = new Integer(5);
//        Integer y = new Integer(6);
//        System.out.println(x.compareTo(y));
//        swap(x,y);
//        System.out.println(x+" "+y);
    }
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
//        System.out.println(a+" "+b);
    }
}
