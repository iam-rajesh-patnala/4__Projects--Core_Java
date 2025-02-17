package Chapter_9_Introduction_to_OOPs;

/*
 *  Polymorphism as the ability of objects to take on many forms. In other words, it allows different objects to respond to the same message or method call in multiple
 * EX: Like a man at the same time is a father, a husband, an employee.
 */

// --> Types of Polymorphism
/*
 *  1. Compile-time Polymorphism (or) Static Method Dispatch
 *      --> (Overloading) <--
 *  2. Runtime Polymorphism (or) Dynamic Method Dispatch
 *      --> (Overriding) <--
 */

// -------------------- Compile-time Polymorphism (or) Static Method Dispatch -------------------

// Def : ---> Method overloading

// When there are multiple functions with the same name but 
// different parameters then these functions are said to be overloaded. 
// Functions can be overloaded by changes in the number of 
// arguments or/and a change in the type of arguments.

class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + " " + b;
    }

}

//---------------------------------------------------------------------

// -------------------- Runtime Polymorphism (or) Dynamic Method Dispatch
// -------------------

// Def : ---> Method overriding

// Method overriding in Java occurs when a subclass provides a specific
// implementation of a method that is already defined in its superclass. The
// method in the subclass should have the same name, return type, and parameter
// list as the method in the superclass. Method overriding is used to provide
// specific behavior for a method in a subclass.

// Superclass -----------
class ElectronicDevice {

    public void turnOn() {
        System.out.println("Device turned on.");
    }
}

// Subclass 1 -----------
class TV extends ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("TV turned on.");
    }
}

// Subclass 2 -----------
class Radio extends ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("Radio turned on.");
    }
}

// --------------------------------------------------

// Main class ---------------------------------------
public class Polymorphism {
    public static void main(String[] args) throws Exception {

        // Creating an object of MethodOverloading class
        MethodOverloading obj = new MethodOverloading();

        // Calling the overloaded methods
        System.out.println("Sum of 5 and 10 is: " + obj.add(5, 10));
        System.out.println("Sum of 5, 10, and 15 is: " + obj.add(5, 10, 15));
        System.out.println("Sum of 3.5 and 2.7 is: " + obj.add(3.5, 2.7));
        System.out.println("Concatenation of 'Hello' and 'World' is: " + obj.add("Hello", "World"));

        // Method overriding -------------------
        ElectronicDevice device = new ElectronicDevice();
        TV tv = new TV();
        Radio radio = new Radio();

        device.turnOn();
        tv.turnOn();
        radio.turnOn();
    }

}
