package structures.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] names) {

        workingWithQueues();

        queueReversing();

        implementingQueueWithArray();

        implementingQueueWithStacks();

        workingWithPriorityQueues();

        implementingPriorityQueue();

        implementingLinkedListQueue();

        implementingStackWithQueues();

    }

    public static void workingWithQueues(){
        System.out.println("\n---------------Working with queues");
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < 10; i++)
            queue.add(i);

        queue.add(10);
        queue.poll();
        queue.isEmpty();
        System.out.println(queue);
    }

    public static void queueReversing(){
        System.out.println("\n---------------Queue reversing");
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < 10; i++)
            queue.add(i);

        System.out.println(queue);
        QueueReverser.reverseWithArray(queue);
        System.out.println("reversed");
        System.out.println(queue);

        QueueReverser.reverseWithStack(queue);
        System.out.println("reversed again");
        System.out.println(queue);

        QueueReverser.reverse(queue, 5);
        System.out.println("partly reversed");
        System.out.println(queue);
    }

    public static void implementingQueueWithArray(){
        System.out.println("\n---------------working with our custom ArrayQueue");
        var arrayQueue = new ArrayQueue(10);

        for (int i = 1; i < 5; i++) {
            arrayQueue.enqueue(i);
        }

        arrayQueue.dequeue();
        arrayQueue.isEmpty();
        arrayQueue.peek();
        System.out.println(arrayQueue);
    }

    public static void implementingQueueWithStacks(){
        System.out.println("\n---------------working with our custom QueueWithTwoStacks");

        var queueStacks = new QueueWithTwoStacks();
        for (int i = 1; i < 5; i++) {
            queueStacks.enqueue(i);
        }

        queueStacks.dequeue();
        queueStacks.peek();
        System.out.println(queueStacks);

    }

    public static void workingWithPriorityQueues(){
        System.out.println("\n---------------working with priority queues");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        System.out.println("automatically sorts integers by their value");
        while(!priorityQueue.isEmpty()) System.out.print(priorityQueue.remove() + ",");
        System.out.println();
    }

    public static void implementingPriorityQueue(){
        System.out.println("\n---------------working with our custom priority queue");
        var customPriorityQueue = new CustomPriorityQueue();
        customPriorityQueue.add(5);
        customPriorityQueue.add(1);
        customPriorityQueue.add(3);
        customPriorityQueue.add(2);
        System.out.println(customPriorityQueue);
        System.out.println(customPriorityQueue.remove());
        System.out.println(customPriorityQueue);
    }

    public static void implementingLinkedListQueue(){
        System.out.println("\n---------------working with our custom LinkedListQueue");
        var linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(5);
        linkedListQueue.dequeue();
        linkedListQueue.isEmpty();
    }

    public static void implementingStackWithQueues(){
        System.out.println("\n---------------working with our custom StackWithTwoQueues");
        var stackWithQueues = new StackWithTwoQueues();
        stackWithQueues.push(2);
        stackWithQueues.pop();
    }

}

