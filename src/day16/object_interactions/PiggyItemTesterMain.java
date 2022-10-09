package day16.object_interactions;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class PiggyItemTesterMain {
    public static void main(String[] args) {

        PiggyBank piggyForVacation = new PiggyBank("Vacation", 200);
        Person veronika = new Person("Veronika", 1000);

        veronika.addMoneyToPiggyBank(1001, piggyForVacation);
        veronika.addMoneyToPiggyBank(500, piggyForVacation);

        System.out.println(veronika.name + " currently has " +veronika.currentMoneyBalance + "€");
        System.out.println(piggyForVacation.savingUpGoal + " bank currently has " +piggyForVacation.currentBalance + "€");

        System.out.println();

        Person nona = new Person("Nona", 800);
        nona.giveMoneyToAnotherPerson(20, veronika);
        System.out.println(veronika.name + " now has " + veronika.currentMoneyBalance);
        System.out.println(nona.name + " now has " + nona.currentMoneyBalance);

        System.out.println();
        int moneyTakenOutOfThePiggy = piggyForVacation.takeOutMoney(65);
        System.out.println("Piggy bank balance: " + piggyForVacation.currentBalance);
        System.out.println("Money taken out of the bank " + moneyTakenOutOfThePiggy);

        System.out.println();
        Item blouse = new Item("Nice Brand Blause");
        veronika.readLableOfTheItem(blouse);
        nona.readLableOfTheItem(blouse);


    }

}
