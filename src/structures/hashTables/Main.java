package structures.hashTables;

import java.util.*;

public class Main {
    public static void main(String[] names) {

        workingWithHashMap();

        workingWithSets();

        findingCharacters();

        customHashTable();

        customHashMap();

        hashTableExercises();

    }

    public static void workingWithHashMap() {
        System.out.println("\n---------------Working with HashMaps");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tomas");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsValue("Tomas"));

        for (var item : map.keySet())   //keys
            System.out.println(item);

        for (var item:map.values())     //values
            System.out.println(item);

        for (var item:map.entrySet())   //key-value pair
            System.out.println(item);
    }

    public static void workingWithSets() {
        System.out.println("\n---------------Working with sets, finding unique items");
        //finding unique list of items
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7};
        for (var item : numbers) {
            set.add(item);
        }
        System.out.println(set);
    }

    public static void findingCharacters(){
        System.out.println("\n---------------Finding characters - using HashMap, HashSet");
        CharFinder finder = new CharFinder();
        var str = "this is a text for testing.";
        var ch = finder.findFirstNonRepeatingChar(str);
        System.out.println(ch);

        ch = finder.findFirstRepeatedChar(str);
        System.out.println(ch);
    }

    public static void customHashTable(){
        System.out.println("\n--------------- Working with our custom hash table");
        CustomHashTable hashTable = new CustomHashTable();
        //there is some nullPointer error...
        //hashTable.put(1,"Tomas");

    }

    public static void customHashMap(){
        System.out.println("\n--------------- Working with our custom hash map");
        var hashMap = new CustomHashMap();
        hashMap.put(1,"Tomas");
    }

    public static void hashTableExercises(){
        System.out.println("\n--------------- hash table exercises:");
        int[] numbers = {1,2,3,3,3,4,5,6,6,7,8,9};
        var exercises = new HashTableExercises();
        var result1 = exercises.twoSum(numbers, 5);
        var result2 = exercises.countPairsWithDiff(numbers,2);
        var result3 = exercises.mostFrequent(numbers);
        System.out.println(Arrays.toString(result1));
        System.out.println(result2);
        System.out.println(result3);
    }




}

