package Chapter_8_StringsBuffer_and_StringBuilder;

/* ------------------- Strings Buffer and String Builder ------------------- */

// 1. String Buffer ---> Mutable
// 2. String Builder ---> Immutable

/*
 * Mutable Strings: Both StringBuffer and StringBuilder allow you to modify the string without creating a new object each time.
 * 1. Use StringBuffer in multithreaded programs where multiple threads may access the same string
 * 2. Use StringBuilder in single-threaded programs for better performance.
 */

//  --> Basic Methods <--

// 1. append()
// 2. insert()
// 3. replace()
// 4. delete() / deleteCharAt()
// 5. reverse()
// 6. capacity() / setLength()
// 7. subString()
// 8. setCharAt()
// 9. indexOf() / lastIndexOf()
// 10. trimToSize()

@SuppressWarnings("ReplaceStringBufferByString")
// -> -> Main Method <- <-
public class StringBufferAndStringBuilder {

    public static void main(String[] args) throws Exception {

        // 1. String Buffer <--
        stringBuffer();

        // 2. String Builder <--
        stringBuilder();
    }

    /* -------------------- 1. String Buffer -------------------- */

    // DEF : String Buffer is a thread-safe class. It is used to store a large
    // amount of data.
    // 1. : Slower due to synchronization overhead.

    // Prevent compiler warnings
    @SuppressWarnings("StringBufferMayBeStringBuilder")

    // --> STRING_BUFFER <--

    public static void stringBuffer() {

        /* --- --> 1. Append a string <-- --- */
        StringBuffer sbObj = new StringBuffer("Hello");

        System.out.println(sbObj);

        // append(String s)
        sbObj.append(" World");
        System.out.println("append(String): " + sbObj);

        // append(char c)
        sbObj.append('!');
        System.out.println("append(char): " + sbObj);

        // append(int i)
        sbObj.append(2024);
        System.out.println("append(int): " + sbObj);

        // append(double d)
        sbObj.append(99.99);
        System.out.println("append(double): " + sbObj);

        // append(char[])
        char[] chars = { ' ', 'J', 'A', 'V', 'A' };
        sbObj.append(chars);
        System.out.println("append(char[]): " + sbObj);

        // ------------------------------

        /* --- --> 2. Insert a string <-- --- */
        StringBuilder sb = new StringBuilder("Hello");

        // insert(int offset, String s)
        sb.insert(5, " Java");
        System.out.println("insert(String): " + sb);

        // insert(int offset, char c)
        sb.insert(10, '!');
        System.out.println("insert(char): " + sb);

        // insert(int offset, int i)
        sb.insert(11, 2024);
        System.out.println("insert(int): " + sb);

        // insert(int offset, char[])
        char[] chars1 = { ' ', 'O', 'K' };
        sb.insert(15, chars1);
        System.out.println("insert(char[]): " + sb);

        // ------------------------------

        /* --- --> 3. Replace a substring <-- --- */
        StringBuffer sbObj1 = new StringBuffer("Girl is ugly");

        // replace(int start, int end, String s)
        sbObj1.replace(8, 12, "Beautiful");
        System.out.println("After replace: " + sbObj1);

        // ------------------------------

        /* --- --> 4. Delete a substring <-- --- */
        StringBuffer sbObj2 = new StringBuffer("Be always positive");

        // delete(int start, int end)
        sbObj2.delete(2, 9);
        System.out.println("After delete: " + sbObj2);

        // deleteCharAt(int index)
        sbObj2.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sbObj2);

        // ------------------------------

        /* --- --> 5. Reverse the string <-- --- */
        StringBuffer name = new StringBuffer("Rajesh Patnala");

        // reverse()
        name.reverse();
        System.out.println("After reverse: " + name);

        /* --- --> 6. Capacity <-- --- */
        StringBuffer wish = new StringBuffer("Hello");

        // capacity()
        System.out.println("Initial capacity: " + wish.capacity());

        // ensureCapacity(int minimumCapacity)
        wish.ensureCapacity(50);
        System.out.println("After ensureCapacity(50): " + wish.capacity());

        // length()
        System.out.println("Length of string: " + wish.length());

        // setLength(int newLength)
        wish.setLength(3);
        System.out.println("After setLength(3): " + wish);

        // ------------------------------

        /* --- --> 7. Substring Methods <-- --- */
        StringBuilder director = new StringBuilder("Christopher Nolan");

        // substring(int start)
        System.out.println("substring(6): " + director.substring(6));

        // substring(int start, int end)
        System.out.println("substring(0, 5): " + director.substring(0, 5));

        // ------------------------------

        /* --- --> 8. Char Manipulation <-- --- */
        StringBuffer women = new StringBuffer("Preethi Neela");

        // charAt(int index)
        System.out.println("Character at index 1: " + women.charAt(1));

        // setCharAt(int index, char ch)
        women.setCharAt(1, 'a');
        System.out.println("After setCharAt: " + women);

        // ------------------------------

        /* --- --> 9. Index Search <-- --- */
        StringBuilder greet = new StringBuilder("Hello Java World Java");

        // indexOf(String s)
        System.out.println("First index of 'Java': " + greet.indexOf("Java"));

        // indexOf(String s, int fromIndex)
        System.out.println("Index of 'Java' after 10: " + greet.indexOf("Java", 10));

        // lastIndexOf(String s)
        System.out.println("Last index of 'Java': " + greet.lastIndexOf("Java"));

        // lastIndexOf(String s, int fromIndex)
        System.out.println("Last index of 'Java' before 15: " + greet.lastIndexOf("Java", 15));

        // ------------------------------

        /* --- --> 10. Trim and Resize <-- --- */
        StringBuffer weight = new StringBuffer(50);
        weight.append("Hello");

        System.out.println("Capacity before trimToSize: " + weight.capacity());
        weight.trimToSize();
        System.out.println("Capacity after trimToSize: " + weight.capacity());
    }

    /* -------------------- 2. String Builder -------------------- */

    // DEF : String Builder is a non-thread-safe class. It is used to store a
    // large amount of data.
    // 1. : Faster due to lack of synchronization overhead.

    // --> STRING_BUILDERS <--

    public static void stringBuilder() {

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World!");
        System.out.println("After append: " + sb);

        // Insert a string
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a substring
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb);

        // Delete a substring
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // --> Basic Methods are same as StringBuffer <--

    }
}

// Key Points to Remember Commonality:
// 1. Commonality: All these methods work the same way for both StringBuffer and
// StringBuilder.
// 2. Thread-Safety: If thread-safety is required, choose StringBuffer.
// Otherwise, prefer StringBuilder for better performance.
// 3. Chaining: Since most of these methods return the same object, you can
// chain them for compact
