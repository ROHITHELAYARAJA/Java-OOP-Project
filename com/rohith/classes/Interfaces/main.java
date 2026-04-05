package com.rohith.classes.Interfaces;
// Interface it self  cannot create an object but it reference can point to an object of implementing class
public class main {
    static void main() {
//        car ferrari = new car();
//        ferrari.start();
//        ferrari.stop();
//
//        ferrari.brake();
//        ferrari.acc();
//        ferrari.power(42);
//        ferrari.power("Supper fast c2 car");
//        PowerEngine engine = new PowerEngine();
//        engine.start();
//        engine.acc();
//        engine.stop();
//        engine.power(8975);
//
//        Media media = new Media();
//        media.play();
//        media.start();
//        media.stop();
//        media.resume();
//
//        ElectricEngine engine2 = new ElectricEngine();
//        engine2.start();
//        engine2.acc();
//        engine2.stop();
//        engine2.power(7292);

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.play();
        Engine electric = new ElectricEngine();
        niceCar.Upgrade(electric);
        niceCar.start();
    }
}
