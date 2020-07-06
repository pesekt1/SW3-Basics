package algorithms.search;

public class Main {
    public static void main(String[] names) {
        var array =new int[]{1,5,2,3,5,5,4,8,9};
        var search = new Search();

        System.out.println("\n---------------Working with search algorithms");
        System.out.println("We show the index of searched item in the array");
        System.out.println("Linear search: "+ search.linearSearch(array, 8));
        System.out.println("binary iterative search: "+ search.binarySearch(array, 8));
        System.out.println("binary recursive search: "+ search.binarySearchRec(array, 8));
        System.out.println("ternary search: "+ search.linearSearch(array, 8));
        System.out.println("jump search: "+ search.jumpSearch(array, 8));
        System.out.println("exponential search: "+ search.exponentialSearch(array, 8));
    }
}

