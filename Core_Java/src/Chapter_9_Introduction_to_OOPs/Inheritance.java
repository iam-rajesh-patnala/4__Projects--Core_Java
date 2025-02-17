package Chapter_9_Introduction_to_OOPs;

/* -------------------- Inheritance -------------------- */

/*
 * 1. Subclass: The class that inherits the attributes and methods of another class.
 * 2. Superclass: The class whose attributes and methods the subclass inherits.
 * 3. Extends: The subclass uses the keyword to inherit the superclass.
 * 4. Reusability: The methods and attributes of the superclass can be reused in the subclass because of inheritance, this is called reusability.
 * 
 */

// 1. Single Inheritance
// 2. Multi-level Inheritance
// 3. Hierarchical Inheritance
// 4. Hybrid Inheritance

//5. Multiple Inheritance

// Main Class ---------------------------------------
public class Inheritance {

    public static void main(String[] args) throws Exception {

        // 1. Single Inheritance -------------------------
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        // 2. Multi-level Inheritance -------------------------
        SportsBike mySportsBike = new SportsBike("BMW", 2020);
        mySportsBike.start();
        mySportsBike.drive();
        mySportsBike.race();
        mySportsBike.getVehicleDetails();

        // 3. Hierarchical Inheritance -------------------------
        Male maleObj = new Male("Rajesh");
        maleObj.play();

        Female femaleObj = new Female("Preethi");
        femaleObj.sleep();
        femaleObj.walk();

        // 4. Hybrid Inheritance -------------------------

        // --> Class
        Dog1 dogObj = new Dog1();
        dogObj.bark();
        dogObj.eat();

        Cat1 catObj = new Cat1();
        catObj.meow();
        catObj.eat();

        // --> Interface
        DomesticDog dog = new DomesticDog();
        dog.play(); // Defined in Domestic interface
        dog.guard(); // Defined in DogBehavior interface
        dog.hunt(); // Defined in Domestic interface
    }
}

// 1. Single Inheritance ----------------------------

// Superclass -----
class Animal {

    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass ----
class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// ------------------------------------------------------------

// 2. Multi-level Inheritance ----------------------------

// Superclass -----
class Vehicle {

    String name;
    int model;

    public Vehicle(String name, int model) {
        this.name = name;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle name: " + name);
        System.out.println("Vehicle model: " + model);
    }

}

// Subclass Car inherited from Vehicle ----
class Bike extends Vehicle {

    public Bike(String name, int model) {
        super(name, model);
    }

    public void drive() {
        System.out.println("The Bike is driving");
    }
}

// Subclass SportsCar inherited from Car ----
class SportsBike extends Bike {

    public SportsBike(String name, int model) {
        super(name, model);
    }

    public void race() {
        System.out.println("The sports Bike is racing");
    }
}

// ------------------------------------------------------------

// 3. Hierarchical Inheritance ----------------------------

// Superclass -----
class Human {

    // attributes
    String name;

    // constructor
    Human(String name) {
        this.name = name;
    }

    // method
    public void walk() {
        System.out.println("Human is walking.");
    }
}

// Subclass 1 -----
class Male extends Human {

    // constructor
    public Male(String name) {
        super(name);
    }

    // method
    public void play() {
        System.out.println(super.name);
        System.out.println(name + " is Playing.");
    }
}

// Subclass 2 -----
class Female extends Human {

    // constructor
    public Female(String name) {
        super(name);
    }

    // method
    public void sleep() {
        System.out.println(super.name);
        System.out.println(name + " is Sleeping.");
    }

    // Overriding method of the super class
    @Override
    public void walk() {
        super.walk(); // calling the super class method
        System.out.println(name + " is Walking.");
    }
}

// ------------------------------------------------------------

// 4. Hybrid Inheritance ----------------------------

// Parent class
class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1 inheriting from Animal
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2 inheriting from Animal
class Cat1 extends Animal1 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Interface defining behavior for domestic animals
interface Domestic {
    void play();
}

// Interface defining behavior for domestic animals
interface Wild {
    void hunt();
}

// Sub-interface for specific type of domestic animals
interface DogBehavior extends Domestic, Wild { // --> Multiple Inheritance
    void guard();
}

// Class implementing Domestic and DogBehavior interfaces
class DomesticDog implements DogBehavior {

    @Override
    public void play() {
        System.out.println("Domestic dog is playing");
    }

    @Override
    public void guard() {
        System.out.println("Domestic dog is guarding");
    }

    @Override
    public void hunt() {
        System.out.println("Domestic dog is hunting");
    }
}
