package oop.interfaces.segregation;

public class CheckBox implements UIWidget{

    @Override
    public void render() {

    }

    @Override
    public void drag() {
        System.out.println("checkbox dragging");
    }

    @Override
    public void resize(int size) {

    }

    @Override
    public void resize(int x, int y) {

    }

    @Override
    public void resizeTo(UIWidget widget) {

    }
}
