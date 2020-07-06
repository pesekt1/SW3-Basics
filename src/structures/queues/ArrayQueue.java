package structures.queues;

import java.util.Arrays;

//our custom Queue implemented with a circular array
//we achieve the circle using 2 pointers.
public class ArrayQueue {
  private int[] items;
  private int rear;
  private int front;
  private int count;

  public ArrayQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) {
    if (isFull())
      throw new IllegalStateException();

    //    basic solution:
    //    items[rear++] = item;
    //    count++;

    // circular array solution
    items[rear] = item;
    rear = (rear + 1) % items.length; // if rear + 1 == items.length we set it to 0 ... circle
    count++;
  }

  public int dequeue() {
    if (isEmpty())
      throw new IllegalStateException();

    //basic solution
    //var item = items[front]
    //items[front++] = 0;
    //return item;

    var item = items[front];
    items[front] = 0;
    front = (front + 1) % items.length; // if front + 1 == items.length we set it to 0 ... circle
    count--;

    return item;
  }

  public int peek() {
    if (isEmpty())
      throw new IllegalStateException();

    return items[front];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return count == items.length;
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }
}
