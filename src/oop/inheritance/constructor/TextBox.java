package oop.inheritance.constructor;

public class TextBox extends UIControl {
  private String text = "";

  //constructor
  public TextBox() {
    super(true); //calling parent constructor
    System.out.println("TextBox constructor");
  }

  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

}
