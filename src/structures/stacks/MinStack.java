package structures.stacks;

//a custom stack that retrieves the minimum value with O(1) run-time efficiency.
// We need two stacks to implement a min stack.
// One stack holds the values, the other stack holds the minimums.
public class MinStack {
  private CustomStack stack = new CustomStack();
  private CustomStack minStack = new CustomStack();

  public void push(int item) {
    stack.push(item);

    if (minStack.isEmpty())
      minStack.push(item);
    else if (item < minStack.peek())
      minStack.push(item); //minStack keeps items sorted, minimum on the top
  }

  public int pop() {
    if (stack.isEmpty())
      throw new IllegalStateException();

    var top = stack.pop();

    if (minStack.peek() == top)
      minStack.pop(); //if minimum item was deleted, we need to delete it from minStack as well

    return top;
  }

  public int min() {
    return minStack.peek();
  }
}
