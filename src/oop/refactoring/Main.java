package oop.refactoring;

//We refactored the procedural code from start package into object oriented code.
//Now we have classes encapsulating the program logic.

public class Main {

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years); //calculator object

        var report = new MortgageReport(calculator); //Report object created using the calculator object as an argument.
        report.printMortgage();
        report.printPaymentSchedule();

    }

}

