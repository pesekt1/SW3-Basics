package oop.interfaces;

public class TaxReport {

  private TaxCalculator calculator; //interface

  //constructor dependency injection
  public TaxReport(TaxCalculator calculator) {
    this.calculator = calculator; // here we substitute the interface with an instance of a TaxCalculator class
  }

  public void show() {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  //method dependency injection
  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  // setter dependency injection
  public void setCalculator(TaxCalculator calculator) {
    this.calculator = calculator;
  }


}
