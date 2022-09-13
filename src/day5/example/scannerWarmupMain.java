package day5.example;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class scannerWarmupMain {
    public static void main(String[] args) {
        Computer niceComputer = new Computer ();
        Scanner scan = new Scanner(System.in);

        Person tom = new Person();
        tom.name = "Tom";
        tom.email = "tom@gmail.com";



        niceComputer.turnOn(tom.name); // we invoke object`s turnOn() method which accepts 1 String parameter
        niceComputer.sendEmail(tom.email, "Hello, this is my first email!");


        System.out.println("Please enter the price of the computer: ");
        niceComputer.price = scan.nextDouble(); // int price = scan.nextInt();
        System.out.println(niceComputer);
        System.out.println("Please enter RAM memory size: ");
        niceComputer.ramMemory = scan.nextInt();
        System.out.println(niceComputer);

        System.out.println("Please enter number of CPUs: ");
        niceComputer.numberOfCpus = scan.nextInt();
        //Lets say today is a special day and you give your user extra 2 CPUs
        niceComputer.numberOfCpus = niceComputer.numberOfCpus +2;
        System.out.println(niceComputer);
        System.out.println("Please tell if computer is used or not. TRUE or FALSE?");
        niceComputer.isUsed = scan.nextBoolean();
        System.out.println("Your computer is all set!");
        System.out.println(niceComputer);





        // three ways of how to store value
       // int age; // default zero
       // int salary = 1000;
       // int numberOfBones = scan.nextInt(); // scan and store integer value to container






    }
}
