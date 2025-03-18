package Java_Oops_Concepts.Interfaces;

interface Vehicle {
    void start(); // Abstract method (no implementation)

    // Concrete method using 'default'
    default void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop(); // Calls default method from the interface
    }
}
