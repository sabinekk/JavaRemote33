package day13.task;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Product productBanana = new Product("Banana", 5);
        Product productApple = new Product("Apple", 1);
        Product productOrange = new Product("Orange", 3);

        Product[] products = {productApple, productBanana, productOrange};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available products are: ");
        System.out.println("1.  " + productBanana);
        System.out.println("2.  " + productApple);
        System.out.println("3.  " + productOrange);
        System.out.println("0 for exit the program.");

        boolean runProgram = true;
        while (runProgram) {
            System.out.println("Chose one of the options: ");
            int userSelection = scanner.nextInt();
            if (userSelection == 1) {
                System.out.println("You have chosen: " + productBanana);
            } else if (userSelection == 2) {
                System.out.println("You have chosen: " + productApple);
            } else if (userSelection == 3) {
                System.out.println("You have chosen: " + productOrange);
            }
            if (userSelection == 0) {
                runProgram = false;
                System.out.println("Checkout: ");
                continue;
            }

        }

    }
}
