package com.rohith.classes.FileHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();  //  it ignore the all white spaces and only it scan the integer only what the user is entered
//        // like this is an example of int
//        // o/p =                  78       dbvd => only 78 because after the integer are goes to the input buffer
//       int m =  sc.nextInt();
//       sc.nextLine(); // it will read the white space character
//       String a = sc.nextLine();
//        System.out.println(n);
//        System.out.println(m);
//        System.out.println(a);
        // another way also having for the to over come this
        int num1 = Integer.parseInt(sc.nextLine()); // getting input as string  and convert it into an number
        int num2 = Integer.parseInt(String.valueOf(sc.nextLine()));
        String name = String.valueOf(sc.nextLine());
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(name);
    }
}
