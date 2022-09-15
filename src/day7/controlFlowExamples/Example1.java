package day7.controlFlowExamples;

public class Example1 {
    public static void main(String[] args) {

        int points = 5;

        // extracted the expression from if (points)
        boolean isWinner = points >30;

        if (isWinner) {
            System.out.println("You won the game!");
        } else {
            System.out.println("You lost the game!");
        }
    }
}
