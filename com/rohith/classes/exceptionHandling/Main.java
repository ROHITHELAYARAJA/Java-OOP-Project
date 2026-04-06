package com.rohith.classes.exceptionHandling;

public class Main {
    static void main() {
        int a = 12;
        String b = "k";
        int c = 0;
        try {
//            int c = a/b;
//             divde(a,c);
//             divde(a, Integer.parseInt(b));
//             throw new Exception("Just for fun");
            String name = "Rohith";
            if(name==("Rohith")) {
                throw new MyException("Name is Rohith");
            }
        }
        catch (MyException x){ // it comes first because the more strict rules are should be above
            System.out.println(x.getMessage());
        }

        catch (ArithmeticException x){ // it comes first because the more strict rules are should be above
//            System.out.println(x.getLocalizedMessage());
            System.out.println(x.getMessage());
        }
        catch (Exception x){ // this catch cannot comes first because below having other exception are should not be excecuted
//            System.out.println(x.getLocalizedMessage());
            System.out.println("Normal Execption");
        }

        finally {
            System.out.println("I will always excecute");
        }
    }
    static int divde(int a, int b) throws  Exception{
        if(b==0){
            throw new ArithmeticException("Cannot Divided By Zero");
        }
        return a/b;
    }

}

