package structures.binaryTrees;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] names) {

        workingWithTrees();

        customTree();

    }

    public static void workingWithTrees(){
        System.out.println("\n--------------working with trees:");
        var treeMap = new TreeMap<Integer, String>();

        var treeSet = new TreeSet<Integer>();
    }

    public static void customTree(){
        System.out.println("\n--------------working with our own tree structure:");
        var tree = new CustomTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(1));
        System.out.println("----pre order travers-------");
        tree.traversePreOrder();
        System.out.println("----in order travers-------");
        tree.traverseInOrder();
        System.out.println("----post order travers-------");
        tree.traversePostOrder();

        System.out.println("tree height:");
        System.out.println(tree.height());

        System.out.println("tree min value:");
        System.out.println(tree.min());

        var tree2 = new CustomTree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        System.out.println("tree1 equals tree2:");
        System.out.println(tree.equals(tree2));

        System.out.println("tree is binary search tree:");
        System.out.println(tree.isBinarySearchTree());

        int depthK = 2;
        System.out.println("nodes at a distance " + depthK + ":");
        System.out.println(tree.getNodesAtDistance(depthK));
    }

}

