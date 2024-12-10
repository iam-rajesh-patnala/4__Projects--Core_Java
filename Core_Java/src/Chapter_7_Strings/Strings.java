package Chapter_7_Strings;

/* ------------------- Strings ------------------- */

// 1. Creating a String
// 2. Accessing characters in a String
// 3. String concatenation
// 4. String Methods
//      4.1 - length()            -> Returns the length of the string (number of characters).
//      4.2 - charAt()            -> Returns the character at the specified index.
//      4.3 - substring()         -> Returns a new string that is a substring of the original string from the start index to the end index (exclusive).
//      4.4 - toLowerCase()       -> Converts all characters in the string to lowercase.
//      4.5 - toUpperCase()       -> Converts all characters in the string to uppercase.
//      4.6 - trim()              -> Removes any leading and trailing whitespace from the string.
//      4.7 - equals()            -> Compares the string with the specified object. Returns true if they are equal, otherwise false.
//      4.8 - equalsIgnoreCase()  -> Compares two strings ignoring case differences.
//      4.9 - indexOf()           -> Returns the index of the first occurrence of the specified character.
//      4.10 - lastIndexOf()      -> Returns the index of the first occurrence of the specified substring.
//      4.11 - contains()         -> Checks if the string contains the specified sequence of characters.
//      4.12 - replace()          -> Replaces all occurrences of the specified old character with the new character.
//      4.13 - replaceAll()       -> Replaces all substrings matching the regular expression with the specified replacement.
//      4.14 - split()            -> Splits the string into an array of substrings based on the specified regular expression.  
//      4.15 - startsWith()       -> Checks if the string starts with the specified prefix.
//      4.16 - endsWith()         -> Checks if the string ends with the specified suffix.
//      4.17 - toCharArray()      -> Converts the string to a new character array.
//      4.18 - valueOf()          -> Converts the specified integer to its string representation.
//      4.19 - concat()           -> Concatenates the specified string to the end of the current string.
//      4.20 - format()           -> Returns a formatted string using the specified format string and arguments.
//      4.21 - intern()           -> You can use the intern() method to force a string into the string pool. After this, == can return true for strings with identical content.
//      4.22 - isEmpty()          -> Checks if the string is empty.
//      4.23 - matches()          -> Matches the string with a regex.
//      4.24 - regionMatches()    -> Compares a substring with a portion of another string.
//      4.25 - replaceFirst()     -> Replaces matching parts of the string
//      4.26 - replaceAll()       -> Replaces matching parts of the string 
//      4.27 - subSequence()      -> Extracts a sequence from the string.
//      4.28 - compareTo()        -> Lexicographically compares strings.
//      4.29 - compareToIgnoreCase()    -> Lexicographically compares strings.
//      4.30 - contentEquals()    -> Compares with a CharSequence
//      4.31 - getBytes()         -> Converts string to a byte array
//      4.32 - isBlank()          -> Checks if the string contains only whitespace or is empty.
//      4.33 - lines()            -> Returns a stream of lines.
//      4.34 - strip()            -> Removes whitespace.
//      4.35 - stripLeading()     -> Removes whitespace.
//      4.36 - stripTrailing()    -> Removes whitespace. 
//      4.37 - toCodePoints()     -> Returns Unicode code points.

// 5. String comparison
// 6. Immutability of Strings

@SuppressWarnings("unused")
public class Strings {
    public static void main(String[] args) throws Exception {

        /* -------------------- 1. Creating a String (2 Ways) -------------------- */

        // -----1.1 - String literal - Created directly
        String greet = "Hello, World!";
        // -----1.2 - String Object - Using new keyword
        String wish = new String("Good Morning!");

        /* ---------------- 2. Accessing characters in a String --------------- */

        String name = "John Doe";
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));

        /* -------------------- 3. String concatenation -------------------- */

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        /* -------------------- 4. String Methods -------------------- */
        stringMethods();

        /* -------------------- 5. String comparison -------------------- */
        String user1 = "Micheal";
        String user2 = "Micheal";
        String user3 = new String("Micheal");

        // 1. String equality - using == operator
        System.out.println(user1 == user2); // Output: true
        System.out.println(user1 == user3); // Output: false

        // 2. String equality - using equals() method
        System.out.println(user1.equals(user3)); // Output: true

        /* -------------------- 6. Immutability of Strings -------------------- */
        String word = "Hello";
        String replacedWord = word.replace('H', 'J');
        System.out.println(word); // Output: Hello
        System.out.println(replacedWord); // Output: Jello

        String nameStr = "Java";
        nameStr = nameStr + " Programming"; // A new string is created
        System.out.println(nameStr); // Output: Java Programming

    }

    public static void stringMethods() {

        // 1. Length() ------------------------------//
        String str1 = "Hello, World!";
        System.out.println(str1.length()); // Output: 13

        // 2. charAt() ------------------------------//
        String str2 = "Hello";
        System.out.println(str2.charAt(1)); // Output: 'e'

        // 3. substring() ------------------------------//
        String str3 = "Hello, World!";
        System.out.println(str3.substring(7, 12)); // Output: 'World'

        // 4. toLowerCase() ------------------------------//
        String str4 = "HELLO";
        System.out.println(str4.toLowerCase()); // Output: 'hello'

        // 5. toUpperCase() ------------------------------//
        String str5 = "hello";
        System.out.println(str5.toUpperCase()); // Output: 'HELLO'

        // 6. trim() ------------------------------//
        String str6 = "   Hello   ";
        System.out.println(str6.trim()); // Output: 'Hello'

        // 7. equals() ------------------------------//
        String str7 = "Hello";
        String str8 = "Hello";
        System.out.println(str7.equals(str8)); // Output: true

        // 8. equalsIgnoreCase() ------------------------------//
        String str9 = "Hello";
        String str10 = "hello";
        System.out.println(str9.equalsIgnoreCase(str10)); // Output: true

        // 9. indexOf() ------------------------------//
        String str11 = "Hello, World!";
        System.out.println(str11.indexOf('o')); // Output: 4
        System.out.println(str11.indexOf("World")); // Output: 7

        // 10. lastIndexOf() ------------------------------//
        String str12 = "Hello, World!";
        System.out.println(str12.lastIndexOf('o')); // Output: 8

        // 11. contains() ------------------------------//
        String str13 = "Hello, World!";
        System.out.println(str13.contains("World")); // Output: true

        // 12. replace() ------------------------------//
        String str14 = "Hello, World!";
        System.out.println(str14.replace('o', '0')); // Output: 'Hell0, W0rld!'

        // 13. replaceAll() ------------------------------//
        String fruits = "apple, banana, apple";
        System.out.println(fruits.replaceAll("apple", "orange")); // Output: 'orange, banana, orange'

        // 14. split() ------------------------------//
        String str15 = "apple,banana,orange";
        String[] fruits1 = str15.split(",");
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }
        // Output: apple banana orange

        // 15. startsWith() ------------------------------//
        String str16 = "Hello, World!";
        System.out.println(str16.startsWith("Hello")); // Output: true

        // 16. endsWith() ------------------------------//
        String str17 = "Hello, World!";
        System.out.println(str17.endsWith("!")); // Output: true

        // 17. toCharArray() ------------------------------//
        String str18 = "Hello";
        char[] chars = str18.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        // Output: H e l l o

        // 18. valueOf() ------------------------------//
        int num = 100;
        System.out.println(String.valueOf(num)); // Output: '100'

        // 19. concat() ------------------------------//
        String str19 = "Hello";
        String str20 = " World!";
        System.out.println(str19.concat(str20)); // Output: 'Hello World!'

        // 20. format() ------------------------------//
        String name = "John";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %d", name, age));
        // Output: Name: John, Age: 25

        // 21. intern() ------------------------------//
        String str21 = new String("Hello");
        String str22 = "Hello";
        System.out.println(str21.intern() == str22); // Output: true

        // 22 . isEmpty() ------------------------------//
        String str23 = "";
        System.out.println(str23.isEmpty()); // Output: true

        // 23. matches() ------------------------------//
        String str24 = "123abc";
        System.out.println(str24.matches("\\d+")); // Output: false

        // 24. replaceFirst() ------------------------------//
        String str25 = "Hello Hello";
        System.out.println(str25.replaceFirst("Hello", "Hi")); // Output: 'Hi Hello'

        // 25. replaceAll() ------------------------------//
        String str26 = "Hello Hello";
        System.out.println(str26.replaceAll("Hello", "Hi")); // Output: 'Hi Hi'

        // 26. subSequence() ------------------------------//
        String str27 = "Rajesh";
        System.out.println(str27.subSequence(1, 3)); // Output: 'aj'

        // 27. compareTo() ------------------------------//
        String str28 = "apple";
        String str29 = "banana";
        System.out.println(str28.compareTo(str29)); // Output: -1

        // 28. compareToIgnoreCase() ------------------------------//
        String str30 = "apple";
        String str31 = "APPLE";
        System.out.println(str30.compareToIgnoreCase(str31)); // Output: 0

        // 29. contentEquals() ------------------------------//
        String str32 = "Hello";
        StringBuffer str33 = new StringBuffer("Hello");
        System.out.println(str32.contentEquals(str33)); // Output: true

        // 30. getBytes() ------------------------------//
        String str34 = "Hello";
        byte[] bytes = str34.getBytes();
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        // Output: 72 101 108 108 111

        // 31. isBlank() ------------------------------//
        String str35 = "   ";
        System.out.println(str35.isBlank()); // Output: true

        // 32. lines() ------------------------------//`
        String str36 = "Hello\nWorld\nJava";
        str36.lines().forEach(System.out::println);
        // Output:
        // Hello
        // World
        // Java

        // 33. strip() ------------------------------//
        String str37 = "   Hello   ";
        System.out.println(str37.strip()); // Output: 'Hello'

        // 34. stripLeading() ------------------------------//
        String str38 = "   Hello   ";
        System.out.println(str38.stripLeading()); // Output: 'Hello '

        // 35. stripTrailing() ------------------------------//
        String str39 = "   Hello   ";
        System.out.println(str39.stripTrailing()); // Output: ' Hello'

        // 36. toCodePoints() ------------------------------//
        String str40 = "Hello";
        int[] codePoints = str40.codePoints().toArray();
        for (int codePoint : codePoints) {
            System.out.print(codePoint + " ");
        }
        // Output: 72 101 108 108 111

        // ---------Another Way--------------
        String str = "Hello";
        str.codePoints().forEach(System.out::println);
        // Output: 72 101 108 108 111

    }

}