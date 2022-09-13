package day4.scanner;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in); //this is the way to create scanner

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("You entered " + firstNumber);

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("You entered " + secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.println("Sum of these numbers is "+ sum);

    }
}
