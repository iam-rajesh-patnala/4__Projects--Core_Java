package Chapter_5_Input_and_Output;

// BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

// IO Exceptions is Handling exception
import java.io.IOException;

// Scanner class
import java.util.Scanner;

// File reader
import java.io.File;
import java.io.FileReader;

/* ------------------- Input and Output ------------------- */

// 1. Accepting input from the Keyboard
//      1.1 - Accepting a single character
//      1.2 - Accepting a String
//      1.3 - Accepting a Integer
//      1.4 - Accepting a Float
//      1.5 - Accepting a Double
//      1.6 - Accepting a Boolean
//      1.7 - Accepting other types of values
//      1.8 - Accepting Different types of Inputs in a line
// 2. Accepting input from a file
// 3. Reading input with java.util.Scanner class
// 4. Reading input with java.io.BufferedReader class
// 5. Displaying Output with System.out.printf(), System.out.println() and System.out.print()
// 6. Displaying formatted Output with String.format()

public class InputAndOutput {

    // Main method
    public static void main(String[] args) throws IOException {

        // 1. Types of Accepting input from the Keyboard
        typesOfAcceptingInput();

        // 1.1 - Accepting a single character
        acceptSingleCharacter();

        // 1.2 - Accepting a String
        acceptString();

        // 1.3 - Accepting a Integer
        acceptInteger();

        // 1.4 - Accepting a Float
        acceptFloat();

        // 1.5 - Accepting a Double
        acceptDouble();

        // 1.6 - Accepting a Boolean
        acceptBoolean();

        // 1.7 - Accepting other types of values
        acceptOtherTypesOfValues();

        // 2. Accepting input from a file
        acceptInputFromFile();

        // 3. Reading input with java.util.Scanner class
        readInputWithScanner();

        // 4. Reading input with java.io.BufferedReader class
        readInputWithBufferedReader();

        // 5. Displaying Output with System.out.printf(), System.out.println() and
        // System.out.print()
        displayOutput();

        // 6. Displaying formatted Output with String.format()
        displayFormattedOutput();
    }

    // 1. Accepting input from the Keyboard ---------------------
    public static void typesOfAcceptingInput() throws IOException {

        // 1. Create BufferedReader object to accept input from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("You entered: " + str);

        // 2. Create Scanner object to accept input from the keyboard
        Scanner scObj = new Scanner(System.in);
        String str2 = scObj.nextLine();
        System.out.println("You entered: " + str2);

        // 3. Accepting a different type of input from the keyboard
        char character = (char) System.in.read();
        System.out.println("You entered: " + character);
        scObj.close();
    }

    // 1.1 - Accepting a single character ---------------------
    public static void acceptSingleCharacter() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        System.out.println("You entered: " + character);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char character2 = (char) br.read();
        System.out.println("You entered: " + character2);
    }

    // 1.2 - Accepting a String ---------------------
    public static void acceptString() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("You entered: " + str1);
    }

    // 1.3 - Accepting a Integer ---------------------
    public static void acceptInteger() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        System.out.println("You entered: " + integer);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int integer2 = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + integer2);
    }

    // 1.4 - Accepting a Float ---------------------
    public static void acceptFloat() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float f2 = Float.parseFloat(br.readLine());
        System.out.println("You entered: " + f2);
    }

    // 1.5 - Accepting a Double ---------------------
    public static void acceptDouble() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println("You entered: " + d);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d2 = Double.parseDouble(br.readLine());
        System.out.println("You entered: " + d2);
    }

    // 1.6 - Accepting a Boolean ---------------------
    public static void acceptBoolean() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        System.out.println("You entered: " + b);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean b2 = Boolean.parseBoolean(br.readLine());
        System.out.println("You entered: " + b2);
    }

    // 1.7 - Accepting other types of values ---------------------
    public static void acceptOtherTypesOfValues() throws IOException {

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        byte byteVal = sc.nextByte();
        short shortVal = sc.nextShort();
        long longVal = sc.nextLong();
        System.out.println("You entered: " + byteVal);
        System.out.println("You entered: " + shortVal);
        System.out.println("You entered: " + longVal);
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte byteVal1 = Byte.parseByte(br.readLine());
        short shortVal1 = Short.parseShort(br.readLine());
        long longVal1 = Long.parseLong(br.readLine());
        System.out.println("You entered: " + byteVal1);
        System.out.println("You entered: " + shortVal1);
        System.out.println("You entered: " + longVal1);
    }

    // 2. Accepting input from a file ---------------------
    public static void acceptInputFromFile() throws IOException {
        // Using Scanner class
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        while (br.ready()) {
            System.out.println(br.readLine());
        }
        br.close();
    }

    // 3. Reading input with java.util.Scanner class
    public static void readInputWithScanner() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight: ");
        float weight = sc.nextFloat();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        sc.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    // 4. Reading input with java.io.BufferedReader class
    public static void readInputWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter your height: ");
        double height = Double.parseDouble(br.readLine());
        System.out.println("Enter your weight: ");
        float weight = Float.parseFloat(br.readLine());
        System.out.println("Enter your address: ");
        String address = br.readLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber = Long.parseLong(br.readLine());
        System.out.println("Enter your email: ");
        String email = br.readLine();
        System.out.println("Enter your password: ");
        String password = br.readLine();
        br.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    // 5. Displaying Output with System.out.printf(), println() and print().
    public static void displayOutput() {
        // Using System.out.printf()
        System.out.printf("Hello, %s", "World");
        System.out.printf("Hello, %s %s", "World", "!");
        System.out.printf("Hello, %s %s %s", "World", "!", "?");
        System.out.printf("Hello, %s %s %s %s", "World", "!", "?", "!");

        // Using System.out.println()
        System.out.println("Hello, World");
        System.out.println("Hello, World!");
        System.out.println("Hello, World?");
        System.out.println("Hello, World?!");

        // Using System.out.print()
        System.out.print("Hello, World");
        System.out.print("Hello, World!");
        System.out.print("Hello, World?");
        System.out.print("Hello, World?!");
    }

    // 6. Displaying formatted Output with String.format()
    public static void displayFormattedOutput() {
        String name = "John";
        int age = 30;
        double height = 1.8;
        String output = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(output);
    }

}
