/* Packages */
// 1. Lowercase with dots separating components.
// 2. Start with the reversed domain name (e.g., com.example).

package Chapter_2_Naming_Conventions_And_Data_Types;

@SuppressWarnings("all") // Prevents warnings

public class NamingConventions {

    /* Constants (Static Final Variables) */
    // 1. All caps with underscores
    public static final String MY_CONSTANT = "Hello, World!";

    public static void main(String[] args) throws Exception {

        /* Variable Naming Conventions */
        // 1. camelCase
        String myVariable = "Hello, World!";
    }

    /* Method Naming Conventions */
    // 1. camelCase
    public static void myMethod() {

    }
}

/* Class Naming Conventions */
// 1. PascalCase
class MyFirstClass {

}