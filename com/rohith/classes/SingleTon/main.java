package com.rohith.classes.SingleTon;

public class main {
    static void main() {
//        Singleton a = new Singleton();
//        System.out.println(a.x);
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("This is reference address for singleton Only one instance "+s1);

    }
}
