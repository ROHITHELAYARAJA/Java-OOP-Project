package com.rohith.classes.Generics.Comparing;

import java.util.Comparator;

public class Student implements  Comparable<Student>{
    int id ;
    float marks;
    public Student(int id,float marks){
        this.id = id;
        this.marks = marks;
    }
    public String toString(){
        return marks+" ";
    }

    @Override
    public int compareTo
            (Student o) {
        System.out.println("compareTo");
//        int diff = (int)(this.marks-o.marks);
//
//        return diff;
         return Float.compare(this.marks,o.marks);
    }
}
