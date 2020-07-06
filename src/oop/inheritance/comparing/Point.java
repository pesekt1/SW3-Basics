package oop.inheritance.comparing;

import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    //if the pointers are equal ... true
    if (this == obj)
      return true;

    // if the object is not instance of Point class ... false
    if (!(obj instanceof Point))
      return false;

    //if both are instance of Point class, compare the coordinates
    var other = (Point) obj; //downcasting
    return other.x == x && other.y == y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
