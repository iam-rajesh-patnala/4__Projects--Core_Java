package Chapter_4_Control_Statements;

/* ------------------- Control Statements ------------------- */

// 1. if...else Statement
// 2. do...while Loop
// 3. while Loop
// 4. for Loop
// -----     1. Nested for Loop
// -----     2. for-each Loop
// 5. switch Statement
// 6. break Statement
// 7. continue Statement
// 8. return Statement

public class ControlStatements {

    // Main method
    public static void main(String[] args) throws Exception {

        // 1. if...else Statement ----------------------
        ifElseStatement();

        // 2. do...while Loop --------------------------
        doWhileLoop();

        // 3. while Loop -------------------------------
        whileLoop();

        // 4. for Loop ---------------------------------
        forLoop();

        // 4.1 Nested for Loop -------------------------
        nestedForLoop();

        // 4.2 for-each Loop ---------------------------
        forEachLoop();

        // 5. switch Statement -------------------------
        switchStatement();

        // 6. break Statement --------------------------
        breakStatement();

        // 7. continue Statement -----------------------
        continueStatement();

        // 8. return Statement ------------------------
        int val = returnStatement();
        System.out.println(val);
    }

    // 1. if...else Statement ----------------------
    public static void ifElseStatement() {

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }

    // 2. do...while Loop --------------------------
    public static void doWhileLoop() {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // 3. while Loop -------------------------------
    public static void whileLoop() {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // 4. for Loop ---------------------------------
    public static void forLoop() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 4.1 Nested for Loop -------------------------
    public static void nestedForLoop() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }

    // 4.2 for-each Loop ---------------------------
    public static void forEachLoop() {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // 5. switch Statement -------------------------
    public static void switchStatement() {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    // 6. break Statement ---------------------------
    public static void breakStatement() {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    // 7. continue Statement ------------------------
    public static void continueStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    // 8. return Statement ---------------------------
    public static int returnStatement() {
        return 10_00_000; // returns the value 10
    }
}