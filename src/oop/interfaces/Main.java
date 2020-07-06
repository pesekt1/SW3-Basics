package oop.interfaces;


public class Main {

    //dependency injection - using interfaces
    public static void main(String[] args) {
        var calculator = new TaxCalculator2019(100_000);
        var report = new TaxReport(calculator); //constructor dependency injection
        report.show();

        report.setCalculator(new TaxCalculator2020(100_000)); //setter dependency injection
        report.show();

        report.show(new TaxCalculator2019(100_000)); //method dependency injection
    }

}
