package oop.inheritance;

public class Main {

    //showing polymorphism, method overriding
    public static void main(String[] args) {

        //example of polymorphism - control.render() ... different render() method for each object.
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls)
            control.render(); // render has different implementation for different class instances - polymorphism

        //example of method overriding:
        var textBox = new TextBox();
        textBox.setText("Text box text field");
        System.out.println(textBox); // overridden toString method in TextBox class

        var checkBox = new CheckBox();
        System.out.println(checkBox); // default toString method (from Object class)

    }
}
