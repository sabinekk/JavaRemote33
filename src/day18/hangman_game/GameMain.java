package day18.hangman_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameMain {
    //static because it will be used in static methods (without creating an object)
    static HangManPrinter hangManPrinter = new HangManPrinter();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //1. create a list with pre-defined words to play with
        //this is an empty list of strings
        List<String> wordsList = new ArrayList<>(); // can be filled up with words from text file
        wordsList.add("computer");
        wordsList.add("elephant");
        wordsList.add("sunshine");
        wordsList.add("watermelon");
        wordsList.add("president");
        //this scary line of code just generates random int between 0 and 3
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 5);
        String randomWord = wordsList.get(randomNumber);

        int randomWordLength = randomWord.length(); //will give us the length of the word
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomWordLength; i++) {
            sb.append("*"); //***goal here is to construct same length "star" string
        }

        //"******" i want to convert to a char array
        char[] hiddenWordSymbolArray = sb.toString().toCharArray();
        // i want to create a corresponding array of chars of my random word
        char[] randomWordSymbolArray = randomWord.toCharArray();

        printInitialInformation();

        //while we have some tries left, we execute the loop
        while (hangManPrinter.numberOfTries > 0) {
            System.out.println("Please guess a single letter: ");
            char guessedSymbol = scanner.next().charAt(0); //counting only the first symbol that corresponds to 0 placing

            if (randomWord.indexOf(guessedSymbol) == -1) {
                //block for incorrect guess
                processIncorrectGuess(hiddenWordSymbolArray);
            } else {
                //block for incorrect guess
                processCorrectGuess(hiddenWordSymbolArray, randomWordSymbolArray, guessedSymbol);

                if (checkIfGameIsWon(hiddenWordSymbolArray)) {
                    System.out.println("You won! Word was <<<< " + randomWord + " >>>>");
                    System.out.println("Game is over.");
                    break;
                }
            }

        }
    }

    //Game is wonf if there is NO HIDDEN "*" symbols anymore
    private static boolean checkIfGameIsWon(char[] hiddenWordSymbolArray) {
        //creating a string out of a given array
        String convertedToFullWord = new String(hiddenWordSymbolArray);
        //returning either true or false if string contains "*" or not
        return !convertedToFullWord.contains("*");
    }

    private static void processCorrectGuess(char[] hiddenWordSymbolArray,
                                            char[] randomWordSymbolArray,
                                            char guessedSymbol) {
        System.out.println("=====================================");
        System.out.println("Wow! Your guess was correct! Correct letter was [" + guessedSymbol + "]. Guess more!");
        for (int i = 0; i < randomWordSymbolArray.length; i++) {
            //i need to check if that symbol exists at specific index in the array
            if (randomWordSymbolArray[i] == guessedSymbol) {
                //i need to replace * with a correctly guessed letter
                hiddenWordSymbolArray[i] = guessedSymbol;
                //**e** will happen
            }
        }
        System.out.println("Word right now looks like this: " + new String(hiddenWordSymbolArray));
    }

    private static void processIncorrectGuess(char[] hiddenWordSymbolArray) {
        hangManPrinter.invokePrinting();
        if (hangManPrinter.numberOfTries > 0) {
            System.out.println("Wrong guess! Try again! You still have " + hangManPrinter.numberOfTries + " left.");
            System.out.println("Word you need to guess looks like this: " + new String(hiddenWordSymbolArray));
        }
    }

    private static void printInitialInformation() {
        System.out.println("Welcome to the game HANG-MAN! :)");
        System.out.println();
        System.out.println("You have to guess a word by guessing a letter (one at the time).");
        System.out.println("If you fail to guess a letter 5 times - you lose!");
    }
}
