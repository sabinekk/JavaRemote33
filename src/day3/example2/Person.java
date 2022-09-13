package day3.example2;

public class Person {

    int age = 22;
    int weightOfPerson = 85;
    int heightOfPerson = 188;
    String hobby = "photography";
    boolean isLatvian;



    void introduction () {
        System.out.println("Hi! My name is Chase!");
    }

    void person () {
        System.out.println("I am " + age + " years young.");
    }

    void looks () {
        System.out.println("I weight " + weightOfPerson + " kg.");
    }

    void tall () {
        System.out.println("I am " + heightOfPerson + " cm tall and I like my height.");

    }
    void hobby () {
        System.out.println("My hobby is taking " + hobby + " and I have been doing it for 7 years already!");
    }

    void nationality () {
        System.out.println("I am proud Latvian " + isLatvian);
    }
}
