package structures.bigO;

//Runtime and space complexity - Big O
public class Main {
    public static void main(String[] names) {
        log( new int[]{1,2,3});

        greet( new String[]{"Tomas","Martin"});

    }

    // runtime complexity ------------------------------
    public static void log(int[] numbers) {
        System.out.println("\n------------- runtime complexity O(1):");
        //runtime complexity O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        System.out.println("\n------------- runtime complexity O(n):");
        //runtime complexity O(n) - it is linear, it depends on the size of the input array
        for (int item : numbers)
            System.out.println(item);

        System.out.println("\n------------- runtime complexity O(n^2):");
        //runtime complexity O(n^2) - it is quadratic
        for (int item : numbers) { //O(n)
            for (int item2 : numbers) { //O(n)
                System.out.println(item + ", " + item2);
            }
        }

        System.out.println("\n------------- runtime complexity O(n^3):");
        //runtime complexity O(n^3)...
        for (int item : numbers) { //O(n)
            for (int item2 : numbers) { //O(n)
                for (int item3 : numbers) { //O(n)
                    System.out.println(item + ", " + item2 + ", " + item3);
                }
            }
        }
    }


    //space complexity---------------------------
    public static void greet(String[] names){
        System.out.println("\n------------- space complexity O(1):");
        //O(1) space complexity - we need to allocate space for one integer - int i
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Hi " + names[i]);
        }

        //O(n) space complexity - we need to allocate memory for a new string with the same size as the input.
        System.out.println("\n------------- space complexity O(n):");
        String[] copy = new String[names.length];
        copy[0] = names[0];
        System.out.println(copy[0]);

        //...
    }

}
