package day14.question;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionMain {

    public static void main(String[] args) {
        Product[] shoppingItems = { new Product("Milk"), new Product("Bread")};
        System.out.println("Welcome to the shop!");

        //shopping item - viens no shopping items array
        for (Product shoppingItem : shoppingItems) {
            System.out.println(shoppingItem);
        }

        Product[] cart = new Product[2]; // 2 empty places in product cart

        boolean continuShopping = true;
        Scanner scanner = new Scanner(System.in);

        while (continuShopping) {
            System.out.println("Please type the name of the product: ");
            String userSelectedProductName = scanner.next();//next line ja grib vairāk vārdu lai nolasa
            for (Product shoppingItem : shoppingItems) {
                //check if user input matches specific product
                if (userSelectedProductName.equalsIgnoreCase(shoppingItem.name)){
                    cart[0] = shoppingItem; //adding found item to the cart
                    continuShopping = false;
                }
            }

        }
        System.out.println("Thank you for shopping!");
        System.out.println("Here is your shopping cart:" + Arrays.toString(cart));

    }
}
