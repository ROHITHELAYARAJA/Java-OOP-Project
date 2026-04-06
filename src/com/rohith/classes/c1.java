package com.rohith.classes;

class Students{
    int sno;
    String name;
    Students(){
//        sno=1;
//        name="Bat-Man";
        this(34,"Rashmika");
    }
    Students(int sno,String name){
//        this.sno=sno;
//     this.name=name;
//          sno=roll;
//          name=naam;
    }

}
public class c1 {

    static void main() {
//        int a [] = new int[2];
//        System.out.println(Arrays.toString(a));
//        int x=10;
//        int y=0;
//        System.out.println(x/y);
        Students st1 = new Students();
        Students st2 = new Students(21,"Krish");
        // datatype rerfernce variable = object constructor();
//        System.out.println(st1.name);
//        System.out.println(st1.sno);
//        System.out.println(st2.name);
        Students x = new Students();
        Students y = x;
        System.out.println("Student name is "+y.name);
    }
}
