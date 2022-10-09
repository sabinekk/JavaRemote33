package day16.task;

import java.util.Scanner;

public class ToDoMain {

    public static void main(String[] args) {

        Chore [] chores = new Chore[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < chores.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". chore information: ");
            System.out.println("Chore name: ");
            String userEnteredChoreName = scanner.next();
            System.out.println("Chore duration: ");
            int userEnteredChoreDuration = scanner.nextInt();

            Chore userCreatedChore = new Chore(userEnteredChoreName, userEnteredChoreDuration);
            chores [i] = userCreatedChore;
        }
        System.out.println();
        System.out.println("Please see available chore list:");
        for (int i = 0; i < chores.length; i++) {
            System.out.println((i+1) + ". " + chores[i].nameOfTheChore + " - " + chores[i].durationOfTheChore + " min");
        }

        System.out.println();
        Resident sabine = new Resident("Sabine");
        sabine.doSpecificChore(chores[0]);


    }
}
