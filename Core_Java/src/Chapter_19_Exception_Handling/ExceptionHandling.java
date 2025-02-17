package Chapter_19_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

// --> DEF: 
// Exception Handling is a mechanism in Java to handle runtime errors, ensuring the normal flow of the application is maintained

// --> Types of Exceptions
/*
 *  1. Compile-time Exceptions (or) Checked Exceptions
 *      --> (Exception) <--
 *  2. Runtime Exceptions (or) Unchecked Exceptions
 *      --> (Exception) <--
 */

// 1. InputMismatchException
// 2. NumberFormatException
// 3. ArithmeticException
// 4. ArrayIndexOutOfBoundsException
// 5. NullPointerException
// 6. IndexOutOfBoundsException
// 7. ClassCastException

// --------------------------------------------------

// Custom Exception for Invalid Number
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

// Main class ----------
public class ExceptionHandling {

    // Method to validate the number
    public static void validateNumber(int num) throws InvalidNumberException {

        if (num < 0) {
            // Throwing a custom exception if the number is negative
            throw new InvalidNumberException("Number must be non-negative!");
        }
        System.out.println("Number is valid.");
    }

    public static void main(String[] args) {
        try {
            // Trying with an invalid number
            System.out.println("Checking the number...");
            validateNumber(-5); // This will throw InvalidNumberException
            System.out.println("Number is valid.");
        } catch (InvalidNumberException e) {
            // Catching the thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // This block is always executed
            System.out.println("End of validation process.");
        }

        // ========================================================

        // 1. InputMismatchException
        inputMismatchException();

        // 2. NumberFormatException
        // numberFormatException();
    }

    // ------------------------------------------------------------

    // 1. InputMismatchException
    public static void inputMismatchException() {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("You entered: " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter; a number.");
        }
    }

    // ------------------------------------------------------------

    // 2. NumberFormatException
    public static void numberFormatException() {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("You entered: " + num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

}
