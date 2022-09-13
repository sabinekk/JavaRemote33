package day6.homeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int salary = scanner.nextInt();

        double socialTaxAmount = taxCalculator.calculateSocialTax(salary);
        System.out.println("Your social tax amount from your salary of " + salary + " is " + socialTaxAmount);

        System.out.println("Please insert your income tax ");
        double incomeTax = scanner.nextDouble();

        double incomeTaxAmount = taxCalculator.calculateIncomeTax(salary, incomeTax);
        System.out.println("Your income Tax amount is " + incomeTaxAmount);

        double totalMonthlySalary = salary - socialTaxAmount - incomeTaxAmount;
        System.out.println("Your total monthly salary is " + totalMonthlySalary);


    }
}
