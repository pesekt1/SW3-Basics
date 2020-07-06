package oop.classes;

//simple class containing fields, constructors and methods.
//we use public or private access modifiers.

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees; // static - not part of an object but part of the class

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (getHourlyRate() * extraHours);
  }

  public int calculateWage() {
    return calculateWage(0);
  }

  //private - it is an implementation, we dont want to access it from outside the class
  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less.");
    this.baseSalary = baseSalary;
  }

  private int getBaseSalary() {
    return baseSalary;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate < 0)
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
    this.hourlyRate = hourlyRate;
  }
}
