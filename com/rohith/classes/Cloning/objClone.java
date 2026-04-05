package com.rohith.classes.Cloning;

import java.util.Arrays;

public class objClone {
    static void main() throws CloneNotSupportedException{
        Human rohith = new Human(18,"Rohith");
//        Human aizen = new Human(rohith);
        Human aizen = (Human) rohith.clone();
        System.out.println(aizen.name);
        System.out.println(Arrays.toString(rohith.arr));
        aizen.arr [0] = 19;
        System.out.println(Arrays.toString(aizen.arr));
        System.out.println(rohith.name);
    }

}
