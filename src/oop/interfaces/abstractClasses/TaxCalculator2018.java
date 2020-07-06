package oop.interfaces.abstractClasses;


public class TaxCalculator2018 extends AbstractTaxCalculator {
  private double taxableIncome;

  private double getTaxableIncome;

  public TaxCalculator2018(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  @Override
  public double calculateTax() {
    getTaxabaleIncome(100_000,50_000); //we can use this method
    return taxableIncome * 0.3;
  }
}
