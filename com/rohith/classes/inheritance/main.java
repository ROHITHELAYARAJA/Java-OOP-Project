package com.rohith.classes.inheritance;

public class main {
    static void main() {
        // default constructor
        Box box1 = new Box();
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
////        parameter with 1 arguement
//        Box box2 = new Box(8);
//        System.out.println(box2.l+" "+box2.h+" "+box2.w);
////        parameter with 3 arguement
//        Box box3 = new Box(3.4,6,2);
//        System.out.println(box3.l+" "+box3.h+" "+box3.w);
////        parameter old existing box is copying to new box4
        Box box4 = new Box(box1);
        System.out.println(box4.l+" "+box4.h+" "+box4.w);
//
//        Box.info();
//
        BoxWeight box5 = new BoxWeight();
        System.out.println(box5.weight);

//        Reference Type   ≠   Object Type
//        Reference Type → Box   (parent)
//        Object Type    → Box2  (child)
        BoxWeight box6 = new BoxWeight(2,4,5,14);
        System.out.println(box6.l +" "+ box6.h +" "+ box6.w+" "+box6.weight);

//| Case                    | Allowed? |
//| ----------------------- | -------- |
//| Parent ref = Parent obj | ✅        |
//| Child ref = Child obj   | ✅        |
//| Parent ref = Child obj  | ✅        |
//| Child ref = Parent obj  | ❌        |

//        It is upcasting parent reference to child class object
        Box box7  = new BoxWeight(1,4,6,8);
        System.out.println(box7.l);
        // it is accesible because what are the type of refernce that datatype object is parent class so the parent
//        the parent class can tell that i am the parent of the child class

//         Let upcast first
        Box box8 = new BoxWeight(1,4,6,8);
//        Next Down Casting
        BoxWeight Box9 = (BoxWeight) box8;
        System.out.println(Box9.weight);

//        Box2 b = new Box(1,3,6);
//        System.out.println(b.weight);
//        Child reference cannot hold parent object because parent object may not contain child-specific properties.
//        So above DownCasting is we doing

        BoxPrice Box10 = new BoxPrice(1,4,6);
        System.out.println("Multilevel Inheritance"+" "+Box10.weight);
        System.out.println("Multilevel Inheritance"+" "+Box10.l+" "+Box10.h+" "+Box10.w);
        System.out.println("Multilevel Inheritance"+" "+Box10.price);

        Box box11 = new BoxWeight();
        box11.msg();
        BoxWeight box12 = new BoxWeight();
        box12.msg(); // hence i can inherit but i cannot override
    }
}


// In basically inheritance the above classs has no idea about below class but the below class has an idea about the above class