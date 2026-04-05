package com.rohith.classes.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int arr[];
    public Human(int age,String name) throws CloneNotSupportedException {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,4,6,7};
    }
//   public   Human(Human copy) throws CloneNotSupportedException {
//        this.age = copy.age;
//        this.name = copy.name;
//    }

    public Object clone() throws CloneNotSupportedException{
        // This is shallow copy
        // it means the primitive data types are copied but the non-primitive data types are not copied so it the refernce is point to the same object
        Human aizen = (Human)super.clone();
        // Making Deep Copy
        aizen.arr = new int[aizen.arr.length];
        for (int i = 0; i < aizen.arr.length; i++) {
            aizen.arr[i] = this.arr[i];
        }
        return aizen;
    }
}
