package Chapter_9_Introduction_to_OOPs;

// -------------------- Abstraction --------------------

// --> DEF: 
//Abstraction in Java refers to hiding the implementation details of a code and exposing only the necessary information to the user. 
//It provides the ability to simplify complex systems by ignoring irrelevant details and reducing complexity.



// What is Abstract Class?

// --> Abstract class is a class that contains one or more abstract methods. 
// --> Abstract class cannot be instantiated, but it can be extended by other classes.
// --> Abstract classes are declared using the abstract keyword. It can contain abstract methods (methods without a body) as well as concrete methods (methods with a body). 

// ---------------

// What is Abstract Method?

// --> Abstract method is a method that is declared without a body ( implementation ).
// --> Abstract methods are declared using the abstract keyword.
// --> Abstract methods cannot be called directly, but they can be overridden in subclasses.
// --> It’s used to define the signature of a method that must be implemented by non-abstract subclasses



// Abstract class 
abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();

    public abstract String tooString();

    // abstract class can have the constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}

// ------------------------------------------------------------

// Concrete class 1 ---------------------
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String tooString() {
        return "Circle color is " + super.getColor()
                + " and area is : " + area();
    }
}

// -------------------------------------------------------------

// Concrete class 2 --------------------
class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {

        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String tooString() {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}

// -------------------------------------------------------------

// Main class --------------------------------
public class Abstraction {
    public static void main(String[] args) throws Exception {

        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.area());
        System.out.println(s2.tooString());

        System.out.println(s1.getColor());
        System.out.println(s2.getColor());

        System.out.println(s1.tooString());
        System.out.println(s2.tooString());
    }
}
