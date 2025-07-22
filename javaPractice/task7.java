public class Task7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Output: Car is starting

        Bike bike = new Bike();
        bike.start();  // Output: Bike is starting
    }
}

// Abstract base class
abstract class Vehicle {
    public abstract void start();
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}
