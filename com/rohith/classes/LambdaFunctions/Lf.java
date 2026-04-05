package com.rohith.classes.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lf {
    static void main() {
        ArrayList <Integer> arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add(i+1);
        }
//        arr.forEach((it) -> System.out.println(it*10));
        Consumer<Integer> ans = ((it) -> System.out.println(it*10));
//      Consumer<Integer> ans = new Consumer<Integer>() {
//    @Override
//    public void accept(Integer it) {
//        System.out.println(it * 10);
//    }
//}; Internally it create like this only ok
        arr.forEach(ans);
//        for(Integer value : arr){
//    ans.accept(value);
//} It internally work like this only

        Operation sum = (a, b) -> a+b;
        Operation prod = (a, b) -> a*b;
        Operation sub = (a, b) -> a-b;
        Operation div = (a, b) -> a/b;
        Lf myCalc = new Lf();
        System.out.println(myCalc.operate(24,90,prod));
     }
//     Lambda Expression → MUST implement Functional Interface otherwise it gives an error

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
interface Operation {

    int operation(int a,int b);
}
