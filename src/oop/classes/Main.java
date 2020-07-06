package oop.classes;

public class Main {

    // Procedural programming vs object oriented programming
    public static void main(String[] args) {

        //using TextBox class
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text); // improvement: Make text private and create a method getText()

        //using Employee class
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);

        //procedural programming
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int wage2 = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage2);

    }

    //procedural programming
    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary + (extraHours*hourlyRate);
    }

}
