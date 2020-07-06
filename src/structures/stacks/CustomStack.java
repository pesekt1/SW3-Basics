package structures.stacks;

import java.util.Arrays;

//our custom stack, build using an array.
//Fixed length - We could implement resizeIfRequired() method like in our DynamicArray
public class CustomStack {
  private int[] items = new int[10]; //hardcoded size
  private int count;

  public void push(int item) {
    //here we could call resizeIfRequired()
    if (count == items.length)
      throw new StackOverflowError();

    items[count++] = item;
  }

  public int pop() {
    if (count == 0)
      throw new IllegalStateException();

    return items[--count];
  }

  public int peek() {
    if (count == 0)
      throw new IllegalStateException();

    return items[count - 1];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  @Override
  public String toString() {
    var content = Arrays.copyOfRange(items, 0, count);
    return Arrays.toString(content);
  }
}
