package Chapter_6_Arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

/* ------------------- Arrays ------------------- */

// 1. Types of Arrays
//      1.1 - One Dimensional Array (1D)
//      1.2 - Multi Dimensional Array (2D, #D)
// 2. Three dimension Arrays (3D Array)
// 3. arrayName.length
// 4. Command line arguments
// 5. Jagged Arrays

// --------------------Key Operations on Arrays---------------------
// 1. Accessing Array Elements:
// 2. Modifying Elements:
// 3. Iterating Through Arrays:
// 4. Finding Length:

// --------------------Methods for Arrays---------------------
// 1. Arrays.toString()
// 2. Arrays.deepToString()
// 3. Arrays.sort()
// 4. Arrays.binarySearch()
// 5. Arrays.equals()
// 6. Arrays.deepEquals()
// 7. Arrays.fill()
// 8. Arrays.copyOf()
// 9. Arrays.copyOfRange()
// 10. Arrays.parallelSort()
// 11. Arrays.stream()
// 12. Arrays.setAll()
// 13. Arrays.asList()
// 14. Arrays.mismatch()
//----------------------
// 15. Arrays.spliterator()
// 16. Arrays.hashCode()
// 17. Arrays.deepHashCode()
// 18. Arrays.compare()
// 19. Arrays.compareUnsigned()
// 20. Arrays.naturalOrder()
// 21. Arrays.reverseOrder()
// 22. Arrays.parallelPrefix()
// 23. Arrays.parallelSetAll()

@SuppressWarnings("unused")
public class ArraysTopics {

    public static void main(String[] args) throws IOException {

        System.out.println("\n \n ");

        /*
         * ---------------------- 1. Types of Array Declaration ----------------------
         */
        // 1.1 - One Dimensional Array (1D)

        // Declaration: ------------------------
        int[] arr; // Recommended
        int arr1[]; // Allowed but less preferred

        // Initialization: ---------------------
        arr = new int[5]; // Declares an array of size 5 filled with 0

        // Combined Declaration and Initialization: -------------------````````
        arr1 = new int[5]; // 5 elements
        arr1 = new int[] { 1, 2, 3, 4, 5 }; // 5 elements

        System.out.println("1D Array: " + Arrays.toString(arr1));

        // -------------------------------------------------

        // 1.2 - Multi Dimensional Array (2D, #D)

        // Declaration: ------------------------
        int[][] matrix; // Recommended
        // Initialization: ---------------------
        matrix = new int[3][3]; // Declares an array of size 3 filled with 0

        // Combined Declaration and Initialization: -------------------
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3x3 matrix

        System.out.println("2D Array: " + Arrays.deepToString(matrix1));

        /*
         * ------------------- 2. Three dimension Arrays (3D Array) -------------------
         */

        // Declaration: ------------------------
        int[][][] cube; // Recommended
        // Initialization: ---------------------
        cube = new int[3][3][3]; // Declares an array of size 3 filled with 0

        // Combined Declaration and Initialization: -------------------
        int[][][] cube1 = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } }; // 3x3 matrix

        System.out.println("3D Array: " + Arrays.deepToString(cube1));

        /*
         * ---------------------------- 3. arrayName.length -------------------------
         */

        String[] fruits = { "apple", "banana", "cherry", "date", "elderberry" };
        System.out.println("Length of fruits array: " + fruits.length);

        /*
         * ------------------------ 4. Command line arguments -----------------------
         */

        int argsLength = args.length;
        System.out.println("Length of arguments: " + argsLength);

        for (int i = 0; i < argsLength; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        /*
         * ------------------------ 5. Jagged Arrays -----------------------
         */

        int[][] jaggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // ----------------------------------------------------
        ArraysTopics.keyOperations();
        ArraysTopics.utilityMethods();
    }

    // ------------------------ Key Operations -----------------------
    public static void keyOperations() {
        String[] names = { "John", "Alice", "Bob", "Charlie" };

        // 1. Accessing Elements
        System.out.println("First element: " + names[0]);
        System.out.println("Last element: " + names[names.length - 1]);

        // 2. Modifying Elements
        names[1] = "Jane";
        System.out.println("Modified array: " + Arrays.toString(names));

        // 3. Iterating Through Arrays
        // ------- Traditional Way -------
        for (int val = 0; val < names.length; val++) {
            System.out.println(names[val]);
        }
        // ------- Enhanced for loop -------
        for (String name : names) {
            System.out.println(name);
        }

        // 4. Finding Length
        int length = names.length;
        System.out.println("Length of the array: " + length);

    }

    // ------------------------ Utility Methods -----------------------
    public static void utilityMethods() {

        // 1. Arrays.toString()
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 2. Arrays.deepToString()
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("2D array: " + Arrays.deepToString(matrix));

        // 3. Arrays.sort()
        int[] unsortedArray = { 5, 2, 8, 1, 3 };
        Arrays.sort(unsortedArray);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray));

        // 4. Arrays.binarySearch()
        int[] sortedArray = { 1, 3, 5, 7, 9 };
        int target = 7;
        int index = Arrays.binarySearch(sortedArray, target);
        System.out.println("Index of " + target + " in sorted array: " + index);

        // 5. Arrays.equals()
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Are arrays equal? " + areEqual);

        // 6. Arrays.deepEquals()
        int[][] array3 = { { 1, 2 }, { 3, 4 } };
        int[][] array4 = { { 1, 2 }, { 3, 4 } };
        boolean areDeepEqual = Arrays.deepEquals(array3, array4);
        System.out.println("Are deep arrays equal? " + areDeepEqual);

        // 7. Arrays.fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 5);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // 8. Arrays.copyOf()
        int[] originalArray = { 1, 2, 3 };
        int[] copiedArray = Arrays.copyOf(originalArray, 5);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // 9. Arrays.copyOfRange()
        String[] originalArray2 = { "java", "php", "ruby", "sql", "node" };
        String[] copiedArray2 = Arrays.copyOfRange(originalArray2, 1, 4);
        System.out.println("Copied array: " + Arrays.toString(copiedArray2));

        // 10. Arrays.parallelSort()
        int[] unsortedArray2 = { 5, 2, 8, 1, 3 };
        Arrays.parallelSort(unsortedArray2);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray2));

        // 11. Arrays.stream()
        int[] array5 = { 1, 2, 3, 4, 5 };
        Arrays.stream(array5).forEach(System.out::println);

        // 12. Arrays.setAll()
        int[] array6 = new int[5];
        Arrays.setAll(array6, i -> i * 2);
        System.out.println("Multiplied array: " + Arrays.toString(array6));

        // 13. Arrays.asList()
        String[] arr = { "A", "B", "C" };
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        // 14. Arrays.mismatch()
        int[] array7 = { 1, 2, 3, 4, 5 };
        int[] array8 = { 1, 2, 3, 4, 6 };
        int mismatchIndex = Arrays.mismatch(array7, array8);
        System.out.println("Mismatch index: " + mismatchIndex);

        // ---------------------------------------------------------

        // 15. Arrays.spliterator() ---- import java.util.Spliterator;
        int[] nums = { 1, 2, 3 };
        Spliterator<Integer> spliterator = Arrays.spliterator(nums);
        spliterator.forEachRemaining(System.out::println);

        // 16. Arrays.hashCode()
        int[] values = { 10, 20, 30 };
        System.out.println("Hash code: " + Arrays.hashCode(values));

        // 17. Arrays.deepHashCode()
        int[][] values2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Deep hash code: " + Arrays.deepHashCode(values2));

        // 18. Arrays.compare()
        int[] numbers1 = { 1, 2, 3 };
        int[] numbers2 = { 1, 2, 4 };
        System.out.println("Result: " + Arrays.compare(numbers1, numbers2));

        // 19. Arrays.compareUnsigned()
        int[] price1 = { 255, 128 };
        int[] price2 = { 255, 130 };
        System.out.println(Arrays.compareUnsigned(price1, price2));

        // 20. Arrays.naturalOrder() ---- import java.util.Comparator;
        Integer[] ranks = { 3, 1, 2 };
        Arrays.sort(ranks, Comparator.naturalOrder());
        System.out.println(Arrays.toString(ranks));

        // 21. Arrays.reverseOrder()
        Integer[] scale = { 3, 5, 2, 4, 1 };
        Arrays.sort(scale, Comparator.reverseOrder());
        System.out.println(Arrays.toString(scale));

        // 22. Arrays.parallelPrefix()
        int[] days = { 1, 2, 3, 4 };
        Arrays.parallelPrefix(days, Integer::sum);
        System.out.println(Arrays.toString(days));

        // 23. Arrays.parallelSetAll()
        int[] days2 = new int[4];
        Arrays.parallelSetAll(days2, Index -> Index * 2);
        System.out.println(Arrays.toString(days2));

    }
}