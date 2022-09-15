package day7.controlFlowExamples;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //use the scanner to create value

        if (age < 18) {
            System.out.println("You are a child!");
        } else if (age >= 18 && age < 66) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a senior (old person)!");
        }

        // + shapeCalculator.areaOfRectangle(userLength, userWidth)
    }
}
//} else if (userWidth <= 1 && userWidth <= 10) {
//                System.out.println("Thank you, you have entered number within the range!");
//} else if (userLength <= 1 && userLength <= 10) {
//                System.out.println("Thank you, you have entered number within the range!");

//if (userLength > 10) {
//    System.out.println("You have entered number bigger than 10!");
//} else if (userLength < 0) {
//     System.out.println("Input cannot be negative!");
//} else if (userLength <= 1 && userLength <= 10) {
//     System.out.println("Thank you, you have entered number within the range!");
//}
//
//        System.out.println("Please enter width of the rectangle");
//        double userWidth = scanner.nextDouble();
//        if (userWidth >= 10) {
//        System.out.println("You have entered number bigger than 10!");
//        } else if (userWidth < 0) {
//        System.out.println("Input cannot be negative!");
//        } else if (userWidth <= 1 && userWidth <= 10) {
//        System.out.println("Thank you, you have entered number within the range!");
//        } else if (userLength <= 1 && userLength <= 10 && userWidth  ){
//        System.out.println("The area of rectangle is "+ shapeCalculator.areaOfRectangle(userLength, userWidth));
//        }