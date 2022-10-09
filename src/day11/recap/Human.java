package day11.recap;

public class Human {

    String name;
    int age;
    boolean hasPreviousCodingKnowledge;

    public Human(String name, int age, boolean hasPreviousCodingKnowledge) {
        this.name = name;
        this.age = age;
        this.hasPreviousCodingKnowledge = hasPreviousCodingKnowledge;
    }

    public void repeatTheWord(String wordToRepeat){
        System.out.println("Repeating your word: " + wordToRepeat);
    }

    public int sumUpTwoNumbers(int numberOne, int numberTwo) {
        // || <- means logical OR operator vai nu viens vai otrs
        // && < means logical AND operator tikai abi divi tad būs rezultāts
        // that means one of the expressions supposed to be true for the condition to be true
        /**
         * 5>2 || 1>3 -> TRUE
         * 5>2 && 1>3 - FALSE
         */
        if (numberOne <= 0 || numberTwo <= 0) {
            System.out.println("I cannot add negative numbers.");
            return 0;
        }else {
            return numberOne + numberTwo;
        }
        }

        //iekavās Lighter ar lielo burtu apzīmē Class / variable is a container that holds anything you want
        public void lightUpTheCigarette(Lighter nameOfTheVariableOrLighter) {
            System.out.println("I will light this up.");
            nameOfTheVariableOrLighter.lightUp();

        }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasPreviousCodingKnowledge=" + hasPreviousCodingKnowledge +
                '}';
    }

}
