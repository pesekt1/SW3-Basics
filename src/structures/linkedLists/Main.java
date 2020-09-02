package structures.linkedLists;

import java.util.LinkedList;

//working with linked lists
//implementing our own linked list
public class Main {
    public static void main(String[] names) {
        workingWithLinkedLists();

        workingWithOurLinkedList();

        findingLoops();
    }

    public static void workingWithLinkedLists(){
        System.out.println("\n-----------------working with linked lists:");
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
        boolean contains = list.contains(20);
        int index = list.indexOf(20);
        int size = list.size();
        var array = list.toArray();
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>(); //generic - Integer
        LinkedList<String> list3 = new LinkedList<>(); //generic - String
    }

    public static void workingWithOurLinkedList(){
        System.out.println("\n-----------------working with our custom linked list:");
        var customList = new CustomLinkedList();
        customList.addLast(10);
        customList.addLast(20);
        customList.addLast(30);
        System.out.println(customList.contains(20));
        customList.removeLast();
        System.out.println(customList);
    }

    public static void findingLoops(){
        System.out.println("\n-----------------finding loops:");
        var loopList = CustomLinkedList.createWithLoop();
        System.out.println(loopList.hasLoop());

        var list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.hasLoop());
    }
}

