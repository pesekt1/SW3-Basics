package oop.interfaces.segregation;

public class Dragger {
  public void drag(UIWidget uiWidget) {
    uiWidget.drag();
    System.out.println("Dragging done!");
  }
}
