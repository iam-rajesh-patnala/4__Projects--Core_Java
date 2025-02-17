package Chapter_21_The_Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Collections {

    public static void main(String[] args) throws Exception {

        System.out.println("\n \n ----------------Tree Map----------------- \n");

        // TreeMap
        TreeMap();

        System.out.println("\n ---------------Hash Map------------------ \n");

        // HashMap
        HashMap();

        System.out.println("\n -------------Linked Hash Map-------------------- \n");

        // Linked Hash Map
        LinkedHashMap();
    }

    // Tree Map
    public static void TreeMap() throws Exception {

        /* ----------- TreeMap -> Sorted by Key, !Allows null values ----------- */

        TreeMap<Integer, String> treeMapObj = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMapObj.put(203, "Rajesh Patnala");
        treeMapObj.put(202, "Kiran Wesley");
        treeMapObj.put(201, "Jack Fance");

        // To get a specific value and store it in a variable
        String val = treeMapObj.get(201);
        System.out.println(val);

        // Removing an element from the TreeMap
        treeMapObj.remove(202);

        // Size of the TreeMap
        System.out.println("Size of the TreeMap: " + treeMapObj.size());

        // To check if the TreeMap is empty
        System.out.println("Is the TreeMap empty? " + treeMapObj.isEmpty());

        // To check if the TreeMap contains a specific key
        System.out.println("Contains key 201? " + treeMapObj.containsKey(201));

        // To check if the TreeMap contains a specific value
        System.out.println("Contains value Rajesh Patnala? " + treeMapObj.containsValue("Rajesh Patnala"));

        // Displaying the TreeMap
        System.out.println(treeMapObj);

    }

    // Hash Map
    public static void HashMap() throws Exception {

        /*
         * ----------- HashMap -> Sorted by not specific, !Allows null values
         * -----------
         */
        HashMap<Integer, String> hashMapObj = new HashMap<>();

        // Adding elements to the HashMap
        hashMapObj.put(303, "JavaScript");
        hashMapObj.put(302, "ReactJS");
        hashMapObj.put(301, "NodeJS");

        // To get a specific value and store it in a variable
        String val = hashMapObj.get(301);
        System.out.println(val);

        // Removing an element from the HashMap
        hashMapObj.remove(302);

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMapObj.size());

        // To check if the HashMap is empty
        System.out.println("Is the HashMap empty? " + hashMapObj.isEmpty());

        // To check if the HashMap contains a specific key
        System.out.println("Contains key 301? " + hashMapObj.containsKey(301));

        // To check if the HashMap contains a specific value
        System.out.println("Contains value JavaScript? " + hashMapObj.containsValue("JavaScript"));

        // Displaying the HashMap
        System.out.println(hashMapObj);

    }

    // Linked Hash Map
    public static void LinkedHashMap() throws Exception {

        /*
         * ----------- LinkedHashMap -> Sorted by Insertion, !Allows null values
         * -----------
         */
        LinkedHashMap<String, Boolean> linkedHashMapObj = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMapObj.put("Rajesh Patnala", true);
        linkedHashMapObj.put("Kiran Wesley", false);
        linkedHashMapObj.put("Jack Fance", true);

        // To get a specific value and store it in a variable
        Boolean val = linkedHashMapObj.get("Kiran Wesley");
        System.out.println(val);

        // Removing an element from the LinkedHashMap
        linkedHashMapObj.remove("Rajesh Patnala");

        // Size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + linkedHashMapObj.size());

        // To check if the LinkedHashMap is empty
        System.out.println("Is the LinkedHashMap empty? " + linkedHashMapObj.isEmpty());

        // To check if the LinkedHashMap contains a specific key
        System.out.println("Contains key Kiran Wesley? " + linkedHashMapObj.containsKey("Kiran Wesley"));

        // To check if the LinkedHashMap contains a specific value
        System.out.println("Contains value true? " + linkedHashMapObj.containsValue(true));

        // Displaying the LinkedHashMap
        System.out.println(linkedHashMapObj);

    }

}
