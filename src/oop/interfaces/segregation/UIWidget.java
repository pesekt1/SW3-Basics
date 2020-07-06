package oop.interfaces.segregation;

//UIWidget can be a textBox, checkBox etc.
public interface UIWidget extends Draggable, Resizable {
  void render();
}

