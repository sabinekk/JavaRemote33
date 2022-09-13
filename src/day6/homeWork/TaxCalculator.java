package day6.homeWork;

public class TaxCalculator {

    //    double salary = 1000.00;
    double socialTax = 0.105;
//    double incomeTax = 0.2;
//    double salaryAfterSocialTaxDeduction = salary - (salary * socialTax);

    double calculateSocialTax(double salary) {
        return salary * socialTax;
    }

    double calculateIncomeTax(double salary, double incomeTax) {
        return salary - (salary * socialTax) * incomeTax;
    }

}
