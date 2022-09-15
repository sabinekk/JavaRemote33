package day7.task;

import java.util.Scanner;

public class ShapeCalculatorMain {
    public static void main(String[] args) {
        Shapes shapeCalculator = new Shapes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which calculator you would like to use? 1, 2, 3 or 4 ");
        int userOption = scanner.nextInt();

        if (userOption == 1) {
            System.out.println("You have chosen to calculate area of rectangle!");
            System.out.println("Please enter length of the rectangle");
            double userLength = scanner.nextDouble();
            double userWidth = scanner.nextDouble();
            if (userLength > 10) {
                System.out.println("You have entered number bigger than 10!");
            } else if (userLength < 0) {
                System.out.println("Input cannot be negative!");
            } if (userWidth > 10) {
                System.out.println("You have entered number bigger than 10!");
            } else if (userWidth < 0) {
                System.out.println("Input cannot be negative!");
            }else if (userLength < 0 && userLength < 10 && userWidth <0 && userWidth <10){
                System.out.println("The area of rectangle is "+ shapeCalculator.areaOfRectangle(userLength, userWidth));
            } else {
                System.out.println("Calculations cannot be made!");
            }




        } else if (userOption == 2) {
            System.out.println("You have chosen to calculate area of circle!");
            System.out.println("Please enter radius of the circle");
            double userRadius = scanner.nextDouble();
            System.out.println("The area of circle is " + shapeCalculator.areaOfCircle(userRadius));

        } else if (userOption == 3) {
            System.out.println("You have chosen to calculate volume of rectangle!");
            System.out.println("Please enter length, width and height of the rectangle");
            double userLength = scanner.nextDouble();
            double userWidth = scanner.nextDouble();
            double userHeight = scanner.nextDouble();
            System.out.println("The volume of rectangle is " + shapeCalculator.volumeOfRectangle(userHeight, userWidth, userHeight));

        } else if (userOption == 4) {
            System.out.println("You have chosen to calculate volume of circle!");
            System.out.println("Please enter radius of the circle");
            double userRadius = scanner.nextDouble();
            System.out.println("The area of circle is " + shapeCalculator.volumeOfSphere(userRadius));
        } else {
            System.out.println("Selected option is not valid!");
        }


    }
}
