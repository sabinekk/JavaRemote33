package day12.arrays.example4;

import java.util.Arrays;
import java.util.Scanner;

public class ITFairmain {

    public static void main(String[] args) {

        Participant[] participants = new Participant[4];

        participants[0] = new Participant("John", 12);
        participants[1] = new Participant("Peter", 5);
        participants[2] = new Participant("Mark", 25);


        System.out.println("Welcome to the fair! Please chose your option: ");
        System.out.println("1. Check participant array.");
        System.out.println("2. Add participant to an array.");

        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();
        if (userSelection == 1) {
          //  System.out.println(Arrays.toString(participants));
            for (Participant participant : participants) {
                System.out.println(participant.name);
            }
        } else if (userSelection == 2) {
            System.out.println("Please enter paricipant`s name: ");
            String name = scanner.next();
            System.out.println("Please enter participant`s experience: ");
            int experience = scanner.nextInt();
            Participant newParticipant = new Participant(name, experience);
            participants[3] = newParticipant;
            System.out.println(Arrays.toString(participants));
        }else {
            System.out.println("Wrong input!");
        }


    }

}
