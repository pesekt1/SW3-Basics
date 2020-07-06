package oop.interfaces.abstractClasses;

import oop.interfaces.TaxCalculator;

public abstract class AbstractTaxCalculator
  implements TaxCalculator {

  //protected - we will be able to use it in the classes that inherits from AbstractTaxCalculator
  protected double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
