package day14.task;

import java.util.Scanner;

public class RestaurantMain {

    public static void main(String[] args) {

        Meal[] meals = new Meal[3];
        Scanner scanner = new Scanner(System.in);

        for (int mealIndex=0; mealIndex <3; mealIndex++) {
            userMealCreation(meals, scanner, mealIndex);
        }
        System.out.println("Please select your meal.");
        for (int i = 0; i < meals.length; i++) {
            System.out.println(i + " . " + meals[i].name);
        }
int userSelection = scanner.nextInt();
        userMealSelection(meals, userSelection);

    }

    private static void userMealSelection(Meal[] meals, int userSelection) {
        if (userSelection == 0) {
            System.out.println(meals[0].name +" - " + meals[0].description + " Price is: " + meals[0].price);
        } else if (userSelection == 1) {
            System.out.println(meals[1].name +" - " + meals[1].description + " Price is: " + meals[1].price);
        } else if (userSelection == 2) {
            System.out.println(meals[2].name +" - " + meals[2].description + " Price is: " + meals[2].price);
        } else {
        System.out.println("Selection does not exist!");
        }
    }

    private static void userMealCreation(Meal[] meals, Scanner scanner, int mealIndex) {
        System.out.println("Please enter information about " + mealIndex + " meal.");
        System.out.println("Please choose the dish: ");
        String name = scanner.next();
        System.out.println("Please describe the meal you want: ");
        String description = scanner.next();
        System.out.println("Please write the price: ");
        double price = scanner.nextDouble();
        Meal userCreatedMeal = new Meal(name, description, price);
        meals[mealIndex] = userCreatedMeal;
    }

}
