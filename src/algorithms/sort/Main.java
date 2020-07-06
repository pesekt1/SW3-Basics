package algorithms.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        int[] array = getUnsortedArray();
        BubbleSort.sort(array);
        System.out.println("bubble sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        SelectionSort.sort(array);
        System.out.println("selection sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        InsertionSort.sort(array);
        System.out.println("insertion sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        MergeSort.sort(array);
        System.out.println("merge sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        QuickSort.sort(array);
        System.out.println("quick sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        CountingSort.sort(array,10);
        System.out.println("counting sort: " + Arrays.toString(array));

        array = getUnsortedArray();
        BucketSort.sort(array,4); //numberOfBuckets > Math.sqrt(maxItem)
        System.out.println("bucket sort: " + Arrays.toString(array));
    }

    public static int[] getUnsortedArray() {
        return new int[]{8, 1, 5, 0, 2, 3, 4, 9, 6};
    }


}

