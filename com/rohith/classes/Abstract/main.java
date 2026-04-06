package com.rohith.classes.Abstract;

public class main {
    static void main() {
        son x = new son(6);
        x.career();
        x.msg();
        System.out.println(x.member);
        daughter d = new daughter(78);
        d.career();
        d.msg();
        System.out.println(d.member);
        System.out.println(parent.value);
        System.out.println(son.value);
        System.out.println(daughter.value);
        son.normal();
        daughter.normal();
        parent.normal();

    }
}
