package day17.strings;

import java.util.Arrays;

public class FunStringsMain {

    public static void main(String[] args) {
        String word = "Today Is Wednesday!"; //this can be connected to char array
        String newShortWord = word.substring(9);
        System.out.println(word); //prints whole sentence
        System.out.println(newShortWord);//prints from the requested spot/index
        System.out.println("___________________________________");

        int length = word.length();
        System.out.println("String length is " + length);
        //shorter way
        System.out.println("String length is " + word.length());

        String phrase = "Finders keepers";
        char[] symbolsInThePhrase = phrase.toCharArray();
        System.out.println(Arrays.toString(symbolsInThePhrase));

        for (char singleSymbols : symbolsInThePhrase){
            System.out.print(singleSymbols + "*");
        }
        System.out.println();
        System.out.println("___________________________________");

        System.out.println(phrase.charAt(2));
        System.out.println(phrase.charAt(9));
        System.out.println(phrase.charAt(5));

        System.out.println("Phrase contains \"Find\" - " + phrase.contains("Find"));
        System.out.println("\tPhrase contains \"Find\" - " + phrase.contains("Find"));
        System.out.println("\t\tPhrase contains \"Find\" - " + phrase.contains("Find"));
        System.out.println("\t\t\tPhrase contains \"Find\" - " + phrase.contains("Find"));
        System.out.println("\t\t\t\tPhrase contains \"Find\" - " + phrase.contains("Find"));

    }
}
