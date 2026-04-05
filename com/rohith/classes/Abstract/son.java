package com.rohith.classes.Abstract;

public class son extends parent{
    @Override
    void career() {
        System.out.println("Son carrer");
    }
    public son  (int member) {
        super(member);
//        this.member = member;
    }
  static  void normal(){
        System.out.println("son normal");
    }

    @Override
    void msg(){
        System.out.println("Son msg");
    }
}
