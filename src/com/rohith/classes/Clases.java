package com.rohith.classes;

class Student {
    int roll=8;
    String name="Bat-Man";
    float mark=001.f;
    void changename(String names){
        name = names;
//        System.out.println("Change name is  :"+names);
    }
    void greeting(){
        System.out.println("Hi my name is  :"+this.name);
    }
    Student(){
//        This keyword where it replacing with the reference variable
//        This keyword which s used to access the curent object created
//        this.roll=1;
//        this.name="Rohith";
//        this.mark=1000.f;
//        Internall Call like this only example
//       s1.roll=1;
//       s1.name="Rohith";
//       s1.mark=100.f;

        // This is how calling constructor to another constructor
        // Internall like this new Student();
        this(12,"Default maka ",200.f);
    }
    Student(int rolls,String names,float marks)
    {
//        Student(int roll,String name,float mark)
//        this.roll =roll;
//        this.name=name;
//        this.mark=mark;
        roll=rolls;
        name=names;
        mark=marks;
    }
    Student(Student other){
        this.roll=other.roll;
        this.name=other.name;
        this.mark=other.mark;
    }
}
public class Clases {
   public static void main(String args[]) {

        int [] roll = new int [5];
        String [] name = new String [5];
        Float [] mark = new Float [5];
        Student [] students = new Student[5];
       Student  s1 = new Student(3,"Axs",473);


//        Student s2 = new Student();
//        s2.name="Supper man";
//        s2.greeting();
//        s1.changename("Mass");
        s1.greeting();
//
//        System.out.println(s1.roll);
//        System.out.println(s1.name);
//        System.out.println(s1.mark);
        Student random = new Student(s1);
       System.out.println(random.name);
        // for calling one constructor to another
       Student random2 = new Student();
       System.out.println(random2.name);

       Student one = new Student();
       Student two = one;
       System.out.println("Two name :"+two.name);
       System.out.println("One name :"+one.name);
       two.name="What maka";
       System.out.println("After changing name Two :"+two.name);
       System.out.println("After changing name Two One also changed :"+one.name);
       System.out.println("Both refernce variable is pointing to the same object created in the heap memory");



   }
}
