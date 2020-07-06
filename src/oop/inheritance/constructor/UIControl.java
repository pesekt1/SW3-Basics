package oop.inheritance.constructor;

public abstract class UIControl {
  private boolean isEnabled = true;

  //constructor with parameter
  public UIControl(boolean isEnabled){
    this.isEnabled = isEnabled;
    System.out.println("UIControl constructor");
  }

  public abstract void render();

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}

