package day17.strings;

import java.util.Scanner;

public class StringBuilderTester {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tom Bla Fish Dog");
        stringBuilder.reverse();
        System.out.println("Reversed string is: " + stringBuilder);
        System.out.println();

        Scanner scannerBob = new Scanner(System.in);
        StringBuilder builderBob = new StringBuilder();
        System.out.println("Enter any word OR type 'STOP' to stop the program.");
        String userInput = "Start";

        //! -> means NOT or negative or negate the statement izsaukuma zīme nozīmē pretējo
        //while strādā kamēr vien neizpildās tas, kas ir iekavās
        //IgnoresCase ļauj tam nebūt case sensiteive
        while (!userInput.equalsIgnoreCase("STOP")) {
            userInput = scannerBob.next();
           if (!userInput.equalsIgnoreCase("STOP")){
               builderBob.append(userInput).append(" - ");
           }
            System.out.println(builderBob);

        }

    }

}
