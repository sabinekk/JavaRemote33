package day11.recap;

public class HumanTester {

    public static void main(String[] args) {

        Human peter = new Human("Peter Jones", 51, true);
        System.out.println(peter);

        Human john  = new Human("John Perry", 24, false);
        System.out.println(john);

        john.repeatTheWord("Bananana");
        peter.repeatTheWord("I can repeat anything");

       int sum = peter.sumUpTwoNumbers(-5, 3);
        System.out.println("Sum is: " + sum);

        Lighter zippo = new Lighter();
        john.lightUpTheCigarette(zippo);

    }

}
