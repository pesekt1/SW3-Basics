package oop.inheritance.casting;

public class UIControl {
  private boolean isEnabled = true;

  public void render(){
    System.out.println("uicontrol render");
  }

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

