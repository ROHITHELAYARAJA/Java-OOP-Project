package com.rohith.classes.Abstract;
class Print{
    void print(String s){
        System.out.println(s);
    }
}
class Out{
    static Print output = new Print();
}
public class Output {
    static void main() {
        Out.output.print("Rohith");
    }
}
