package Chapter_3_Operators;

// Operators

// 1. Arithmetic Operators
// 2. Unary Operators
// 3. Increment Operator
// 4. Decrement Operator
// 5. Assignment Operators
// 6. Relational Operators
// 7. Logical Operators
// 8. Boolean Operators
// 9. Bitwise Operators
// 10. Ternary Operator

/*
 * 1. Instance of Operator
 * 2. New Operator
 * 3. Cast Operator
 */

public class Operators {

    public static void main(String[] args) throws Exception {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + add(a, b)); // 15
        System.out.println("a - b = " + subtract(a, b)); // 5
        System.out.println("a * b = " + multiply(a, b)); // 50
        System.out.println("a / b = " + divide(a, b)); // 2.0
        System.out.println("a % b = " + modulus(a, b)); // 0

        // Unary Operators
        System.out.println("+a = " + unaryPlus(a)); // 10
        System.out.println("-a = " + unaryMinus(a)); // -10

        // Increment Operators
        System.out.println("++a = " + preIncrement(a)); // 11
        System.out.println("--a = " + postIncrement(a)); // 10

        // Decrement Operators
        System.out.println("--a = " + preDecrement(a)); // 9
        System.out.println("++a = " + postDecrement(a)); // 10

        // Assignment Operators
        System.out.println("a = " + assign(a, b)); // 5

        // Relational Operators
        System.out.println("a > b = " + greaterThan(a, b)); // true
        System.out.println("a < b = " + lessThan(a, b)); // false
        System.out.println("a >= b = " + greaterThanEqual(a, b)); // true
        System.out.println("a <= b = " + lessThanEqual(a, b)); // false
        System.out.println("a == b = " + equalTo(a, b)); // false
        System.out.println("a != b = " + notEqualTo(a, b)); // true

        // Logical Operators
        System.out.println("a && b = " + logicalAnd(a, b)); // true
        System.out.println("a || b = " + logicalOr(a, b)); // true
        System.out.println("!a = " + logicalNot(a)); // false

        // Boolean Operators
        System.out.println("a & b = " + booleanAnd(a, b)); // 0
        System.out.println("a | b = " + booleanOr(a, b)); // 15
        System.out.println("a ! b = " + booleanNot(a, b)); // 10
    }

    /* 1. ================== Arithmetic Operators ================== */

    // Addition: a + b
    public static int add(int a, int b) {
        return a + b; // returns the sum of a and b
    }

    // Subtraction: a - b
    public static int subtract(int a, int b) {
        return a - b; // returns the difference of a and b
    }

    // Multiplication: a * b
    public static int multiply(int a, int b) {
        return a * b; // returns the product of a and b
    }

    // Division: a / b
    public static double divide(double a, double b) {
        return a / b; // returns the quotient of a and b
    }

    // Modulus: a % b
    public static int modulus(int a, int b) {
        return a % b; // returns the remainder of a divided by b
    }

    /* 2. ================== Unary Operators ================== */

    // Unary plus: +a
    public static int unaryPlus(int a) {
        return +a; // returns the value of a
    }

    // Unary minus: -a
    public static int unaryMinus(int a) {
        return -a; // returns the negation of a
    }

    /* 3. ================== Increment Operators ================== */

    // Pre Increment: ++a
    public static int preIncrement(int a) {
        return ++a; // returns the value of a incremented by 1
    }

    // Post Decrement: --a
    public static int postIncrement(int a) {
        return a++; // returns the value of a decremented by 1
    }

    /* 4. ================== Increment Operator ================== */

    // Pre Decrement: --a
    public static int preDecrement(int a) {
        return --a; // returns the value of a decremented by 1
    }

    // Post Increment: ++a
    public static int postDecrement(int a) {
        return a--; // returns the value of a incremented by 1
    }

    /* 5. ================== Assignment Operators ================== */

    // Assignment: a = b
    public static int assign(int a, int b) {
        a = b; // returns the value of a
        return a;
    }

    /* 6. ================== Relational Operators ================== */

    // 1. Grater than: (>)
    public static boolean greaterThan(int a, int b) {
        return a > b;
    }

    // 2. Less than: (<)
    public static boolean lessThan(int a, int b) {
        return a < b;
    }

    // 3. Grater than or equal to: (>=)
    public static boolean greaterThanEqual(int a, int b) {
        return a >= b;
    }

    // 4. Less than or equal to: (<=)
    public static boolean lessThanEqual(int a, int b) {
        return a <= b;
    }

    // 5. Equal to: (==)
    public static boolean equalTo(int a, int b) {
        return a == b;
    }

    // 6. Not equal to: (!=)
    public static boolean notEqualTo(int a, int b) {
        return a != b;
    }

    /* 7. ================== Logical Operators ================== */

    // 1. AND: (&&)
    public static boolean logicalAnd(int a, int b) {
        return a > 0 && b > 0;
    }

    // 2. OR: (||)
    public static boolean logicalOr(int a, int b) {
        return a > 7 || b > 7;
    }

    // 3. NOT: (!)
    public static boolean logicalNot(int a) {
        return !(a > 0);
    }

    /* 8. ================== Boolean Operators ================== */

    //1. Boolean AND: (&&)
    public static boolean booleanAnd(int a, int b) {
        return a > 0 & b > 0;
    }

    //2. Boolean OR: (||)
    public static boolean booleanOr(int a, int b) {
        return a > 7 | b > 7;
    }

    //3. Boolean NOT: (!)
    public static boolean booleanNot(int a, int b) {
        return !(a > 0);
    }

}
