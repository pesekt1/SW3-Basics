package structures.stacks;

import java.util.Stack;

public class StringReverser {
  public String reverse(String input) {
    if (input == null)
      throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray())
      stack.push(ch);

    //we dont use string because it is immutable
    //better to use mutable StringBuffer or StringBuilder
    StringBuffer reversed = new StringBuffer();
    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}
