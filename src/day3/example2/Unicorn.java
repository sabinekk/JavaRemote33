package day3.example2;

public class Unicorn {

    String colour;
    boolean hasHorn;
    boolean hasWings;
    int legs = 4;

    //void is a return type witch mean that functions does not return anything.
    void fly(){
        System.out.println("I am flying!");
    }
    void shine () {
        System.out.println("I am shining!");
    }
    void intoruce (){
        System.out.println("Hello, everyone!");
        System.out.println("My colour is " + colour);
        System.out.println("I have " + legs + " legs.");
        System.out.println("I have horn " + hasHorn);
        System.out.println("I hvae wings " + hasWings);
    }

    String gerNameOfAUnicorn () {
        return "Sparky";
    }



}
