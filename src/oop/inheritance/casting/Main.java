package oop.inheritance.casting;

public class Main {

    // example of upcasting and downcasting
    public static void main(String[] args) {

        var control = new UIControl();
        var textBox = new TextBox();
        textBox.setText("this is textBox text");

        showUIControl(control);
        showUIControl(textBox); //upcasting: TextBox -> UIControl
    }

    public static void showUIControl(UIControl control){

        if (control instanceof TextBox){
            var textBox = (TextBox)control; //downcasting - only allowed if control is an instance of TextBox
            textBox.setText("new text for textBox");
        }
        System.out.println(control);
    }
}
