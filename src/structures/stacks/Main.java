package structures.stacks;


import java.util.Stack;

//working with stacks
//implementing our own custom stack
public class Main {

    public static void main(String[] names) {
        workingWithStacks();

        reversingStrings();

        workingWithExpressions();

        workingWithCustomStack();

        workingWithTwoStacks();

        workingWithMinStack();
    }

    public static void workingWithStacks(){
        System.out.println("\n-------------working with stacks:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        stack.empty();
        top = stack.peek();
    }

    public static void reversingStrings(){
        System.out.println("\n--------------reversing strings:");
        var stringReverser = new StringReverser();
        String str = "abcdef";
        System.out.println(stringReverser.reverse(str));
    }

    public static void workingWithExpressions(){
        System.out.println("\n------------working with expressions:");
		String string = "{[(())]";      //missing } in the end
		String string2 = "  public Employee(int baseSalary) {this(baseSalary, 0);}";
		System.out.println(new Expression().isBalanced(string));
        System.out.println(new Expression().isBalanced(string2));
    }

    public static void workingWithCustomStack(){
        System.out.println("\n--------------working with custom stack:");
        var customStack = new CustomStack();
        System.out.println(customStack.isEmpty());
        for (int i = 0; i < 4; i++) {
            customStack.push(i);
        }
        System.out.println(customStack.peek());
        System.out.println(customStack.toString());
        System.out.println(customStack.isEmpty());
    }

    public static void workingWithTwoStacks(){
        System.out.println("\n--------------working with custom TwoStack:");
        var doubleStack = new TwoStacks(10);

        System.out.println("stack1 empty:" + doubleStack.isEmpty1());
        System.out.println("stack2 empty:" + doubleStack.isEmpty2());
        System.out.println("stack1 full: " + doubleStack.isFull1());

        for (int i = 1; i < 5; i++){
            doubleStack.push1(i);
            doubleStack.push2(i);
        }

        doubleStack.pop1();
        doubleStack.pop2();
        System.out.println(doubleStack.toString());
        System.out.println("stack1 full: " + doubleStack.isFull1());
    }

    public static void workingWithMinStack(){
        System.out.println("\n--------------working with custom MinStack:");
        var minStack = new MinStack();
        minStack.push(4);
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());


    }
}

