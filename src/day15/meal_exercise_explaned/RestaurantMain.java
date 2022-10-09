package day15.meal_exercise_explaned;

import java.util.Arrays;
import java.util.Scanner;

public class RestaurantMain {

    public static void main(String[] args) {

        Meal[] meals = new Meal[2]; //an empty array which can hold up to 3 Meal objects
        Scanner scanner = new Scanner(System.in);

        for (int mealIndex = 0; mealIndex <2; mealIndex++) { //skaita 0,1,2 = 3 vienības
            System.out.println("Enter " + mealIndex + " Meal information.");
            System.out.println("Enter name: ");
            String userEnteredName = scanner.next();
            System.out.println("Enter description: ");
            String userEnteredDescription = scanner.next();
            System.out.println("Enter price: ");
            double userEnteredPrice = scanner.nextDouble();

            Meal userCreatedMeal = new Meal(userEnteredName, userEnteredDescription, userEnteredPrice);
            meals[mealIndex] = userCreatedMeal; //liek index,lai ir dinamiskāks un nav ar roku jāmaina cipari

        }

        System.out.println();
        System.out.println("Please select the meal you like the most.");
        for (int i = 0; i < meals.length; i++) {
            System.out.println(i + "." + meals[i].userAddedName);
        }
        int userSelection = scanner.nextInt();
        if (userSelection == 0) {
            System.out.println(meals[0].userAddedName + " - " +meals[0].userAddedDecription + " Price is: " + meals[0].userAddedPrice);
        } else if (userSelection == 1) {
                System.out.println(meals[1].userAddedName + " - " +meals[1].userAddedDecription + " Price is: " + meals[1].userAddedPrice);
        } else {
            System.out.println("Meal does not exist in the menu!");
        }
    }

}
