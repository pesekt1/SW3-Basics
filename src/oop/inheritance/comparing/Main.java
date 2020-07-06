package oop.inheritance.comparing;

public class Main {

    public static void main(String[] args) {

        var point1 = new Point(1,2);
        var point2 = new Point(1,2);

        System.out.println(point1 == point2); // compares pointers... false
        System.out.println(point1.equals(point2)); //true because we have overridden equals() method

    }
}
