package oop.interfaces.tightlyCoupled;

//example of thightly coupled classes - TaxReport is coupled with TaxCalculator
//If TaxCalculator changes, we might need to change TaxReport as well

public class TaxReport {

  private TaxCalculator calculator;

  public TaxReport() {
    calculator = new TaxCalculator(100_000);
  }

  public void show() {
    var tax = calculator.calculateTax();
    System.out.println("Tax is " + tax);
  }

}
