package com.rohith.classes.EnumExample;

public class Basic {

    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are the enum constants
        // It is by default public , static , final
        // since it is final so we cannot create the child enum
        // type is Week
        // fixed group of object means then we can use the enum
        Week(){
            System.out.println("Constructor called :" + this);
        }
        // Interface are many can be allowed
        // but abstract are not allowded body is required otherwise we got error
        public void msg(){
            System.out.println("Message from Basic class");
        }


        // this is not public or protected it is only private or default
        // Why? we don't want to create new object that is the reason
        // this is not the enum concept that's why

        // Internally it work like this : public static final Week friday = new Week();

        }


    static void main() {
        Week week;
        week = Week.Friday;
        week.msg();


//        for (Week w:Week.values()){
//            System.out.println(w);
//        }
//        System.out.println(week);
//        System.out.println(week == Week.Monday); // it is used to check the ddays are equal
//
//        System.out.println(week.ordinal()); // it print the positions
    }
}
