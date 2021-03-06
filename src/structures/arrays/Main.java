package structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

//working with arrays
//creating our own dynamic array
public class Main {
    public static void main(String[] names) {

        workingWithArrays();

        workingWithVectors();

        workingWithArrayLists();

        workingWithOurCustomArray();
    }

    public static void workingWithArrays(){
        System.out.println("\n--------------Working with arrays:");
        int[] numbers = {10, 20, 30};
        int[] numbers2 = new int[3];
        System.out.println(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }

    //vector is a dynamic array, it grows by 100%
    //methods in vector are synchronized - only 1 thread can access a vector object.
    public static void workingWithVectors(){
        System.out.println("\n--------------Working with vectors:");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.remove(0);
        System.out.println(vector);
    }

    //arrayList is a dynamic array, it grows by 50%
    //methods are asynchronous - multiple threads can access an arrayList object
    public static void workingWithArrayLists(){
        System.out.println("\n--------------Working with arrayLists:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(20));
        System.out.println(list);
    }

    public static void workingWithOurCustomArray(){
        System.out.println("\n-------------Working with our custom array:");
        var dynamicArray = new DynamicArray(3);
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);

        dynamicArray.removeAt(0); //remove item at index
        dynamicArray.print();

        var index = dynamicArray.indexOf(20); //index of first occurrence
    }
}

