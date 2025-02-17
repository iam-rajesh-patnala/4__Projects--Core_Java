package Chapter_9_Introduction_to_OOPs;

// -------------------- Class and Object ----------------

// DEF: 
//A class is a blueprint or template for creating objects, which are instances of that class. 
//Objects are real-world entities that have attributes (properties) and behavior (methods) that define their behavior.

public class ClassAndObject {

    public static void main(String[] args) {

        // Creating an object ----------------

        Car car1 = new Car(); // Object Creation 
        car1.brand = "Toyota"; // Assigning values
        car1.speed = 100;

        car1.drive(); // Invoking a method

    }
}

// Creating a class ----------------

class Car {
    String brand; // Property: Car's brand
    int speed; // Property: Car's speed

    // Behavior: What the car can do
    void drive() { 
        System.out.println(String.format("%s is driving at %d km/h", brand, speed));
    }
}