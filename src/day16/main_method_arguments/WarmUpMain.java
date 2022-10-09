package day16.main_method_arguments;

import java.util.Arrays;

public class WarmUpMain {

    public static void main(String[] args) {

        //System.out.println("This is a English to Polish converter.");
        //System.out.println("Converting file " + args[0]);
        //System.out.println("Converting..");

        String number = args[0];
        int converedNumber = Integer.parseInt(number);
        System.out.println(number);
        System.out.println(converedNumber);

        String userEnteredPhoneNumber = "+37525454";
        userEnteredPhoneNumber = userEnteredPhoneNumber.substring(1);
        int phoneNumber = Integer.parseInt(userEnteredPhoneNumber);
        System.out.println(phoneNumber);

    }
}
