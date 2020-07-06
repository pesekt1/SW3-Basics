package structures.bigO;

//Runtime and space complexity - Big O
public class Main {
    public static void main(String[] names) {
    }

    // runtime complexity ------------------------------
    public static void log(int[] numbers) {
        //runtime complexity O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        //runtime complexity O(n) - it is linear, it depends on the size of the input array
        for (int item : numbers)
            System.out.println(item);

        //runtime complexity O(n^2) - it is quadratic
        for (int item : numbers) { //O(n)
            for (int item2 : numbers) { //O(n)
                System.out.println(item + ", " + item2);
            }
        }

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
    public void greet(String[] names){
        //O(1) space complexity - we need to allocate space for int i
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Hi " + names[i]);
        }

        //O(n) space complexity
        String[] copy = new String[names.length];
        //...
    }

}
