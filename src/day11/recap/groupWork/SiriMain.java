package day11.recap.groupWork;

import java.util.Scanner;

public class SiriMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Siri siri = new Siri("My Siri", 10, 99.99, "English");

        System.out.println();

        System.out.println("Please choose a song");
        String songToPlay = scanner.nextLine();

        siri.playSpotify(songToPlay);
        System.out.println("Playing " +songToPlay);

        System.out.println("Please choose two numbers:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        int makeSiriSumNumbers = siri.addTwoNumbers(numberOne, numberTwo);
        System.out.println("Sum of numbers is: " +makeSiriSumNumbers);
    }





    }

