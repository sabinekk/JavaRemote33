package day18.hangman_game;

public class HangManPrinter {
    int numberOfTries = 5;

    public int invokePrinting() {
        if (numberOfTries == 5) {
            printHangManPart("MISTAKE!\n_________\n |\n 0\n");
        } else if (numberOfTries == 4) {
            printHangManPart("MISTAKE!\n_________\n |\n 0\n |\n");
        } else if (numberOfTries == 3) {
            printHangManPart("MISTAKE!\n_________\n |\n 0\n/|\n");
        } else if (numberOfTries == 2) {
            printHangManPart("MISTAKE!\n_________\n |\n 0\n/|\\\n");
        } else if (numberOfTries == 1) {
            printHangManPart("MISTAKE!\n_________\n |\n O\n/|\\\n/ \\\n");
        }

        numberOfTries = numberOfTries - 1;
        return numberOfTries;
    }

    private void printHangManPart(String hangManPart) {
        System.out.println(hangManPart);
    }

}
