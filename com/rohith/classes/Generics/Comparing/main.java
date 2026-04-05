package com.rohith.classes.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    static void main() {
        Student rohith = new Student(7, 89.6f);
        Student aizen = new Student(1, 95.6f);
        Student prasad = new Student(3, 90.6f);
        Student red_dragon = new Student(4, 100.0f);
        Student[] list = {rohith, aizen, prasad, red_dragon};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
        if(rohith.compareTo(aizen)<0) // Internally working is the this.compareTo(o) it means rohith.compareTo(aizen)
            // this  = current object always
            // o = passed object
            // here we are just comparing who get more mark
        {
            System.out.println("Aizen more Mark ");
        }

        else if(rohith.compareTo(aizen)>0){
            System.out.println("Rohith more Mark ");
        }
        else{
            System.out.println("Both are equal mark");
        }
    }
}