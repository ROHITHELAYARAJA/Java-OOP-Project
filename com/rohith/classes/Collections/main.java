package com.rohith.classes.Collections;
import java.util.*;
import java.util.Collections;
import  java.util.LinkedList;
public class main {
   public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
       System.out.println(Arrays.asList(list)); // it give the List<List<Integer>> list of list
       System.out.println(list2);

       List<Integer> vector = new Vector<>();// it is slow so it is not recommendable to use
       vector.add(1);
       vector.add(2);
       vector.add(3);
       vector.add(4);
       System.out.println(vector);
    }
}
