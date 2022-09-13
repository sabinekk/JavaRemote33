package day6.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //in order to use functions of an object, i need to create an object
        Calculator simpleCalculator = new Calculator();
        //add function RETURNS a double value which can be stored in a variable.
        double sum = simpleCalculator.add(2.5, 1.4);
        System.out.println(sum);

        //can do in two ways - first
        double subtract = simpleCalculator.subtract(246.6, 5.4);
        System.out.println(subtract);
        //second
        System.out.println(simpleCalculator.subtract(324.6, 423.6));

        double strangeNumber = 2.2 * simpleCalculator.multiply(1,1);
        System.out.println(strangeNumber);

        Scanner fridaySacanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstUserInput = fridaySacanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondUserInput = fridaySacanner.nextDouble();

        double divisionResult = simpleCalculator.divide(firstUserInput, secondUserInput);
        System.out.println("Division result is: " + divisionResult);


    }
}
