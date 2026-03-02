package Oops;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class HeirarchicalInheritance {

    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}
