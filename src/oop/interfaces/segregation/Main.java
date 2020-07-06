package oop.interfaces.segregation;


public class Main {

    //dependency injection - using interfaces
    public static void main(String[] args) {
        var dragger = new Dragger();
        var checkBox = new CheckBox();
        dragger.drag(checkBox);
    }

}
