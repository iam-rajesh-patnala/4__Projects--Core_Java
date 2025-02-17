package Chapter_9_Introduction_to_OOPs;

/* -------------------- Encapsulation -------------------- */

/*
 * 1.  Encapsulation describes bundling data and methods that work on that data within one unit, like a class.
 * 2.  It ensures that no one can directly change or misuse the data. Instead, they must use methods to interact with it.
 * 3.  Getter and setter methods are used to access and modify the private variables (fields) of a class, respectively
 * 4.  Data hiding is achieved by declaring class attributes as private, meaning they are accessible only within the class itself. Outside classes cannot directly access or modify these   private attributes. Instead, interactions with these attributes are typically mediated through public methods such as getters and setters, which provide controlled access to the data.
 */

// -------------------------------------

public class Encapsulation {

    public static void main(String[] args) throws Exception {

        Person person = new Person("Rajesh", 25);

        // Display initial person details
        person.display();

        // Updated person name
        person.setName("Jane Doe");

        // Updated person age
        person.setAge(30);

        // Display updated person details
        person.display();
    }
}

// ----- Person class -----
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the age
    public int getAge() {
        return age;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for the age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
