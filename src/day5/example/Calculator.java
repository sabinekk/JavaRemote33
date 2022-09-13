package day5.example;

public class Calculator {

    int number1;
    int number2;
    String operation;

    void calculate () {
        if (operation.equals("+")) {
            System.out.println("Sum is: " + (number1 + number2));
        }
        else if (operation.equals("-")) {
            System.out.println("Substract is: " + (number1 - number2));
        }
        else if (operation.equals("*")) {
            System.out.println("Multiplicate is: " + (number1 * number2));
        }
        else if (operation.equals("/")) {
            System.out.println("Diviation is: " + (number1 / number2));
        }
    }

}
