package day5.example;

public class Computer {

    final String brand = "HP";
    double price;
    int ramMemory;
    int numberOfCpus;
    boolean isUsed;

    void turnOn(String name) {
        System.out.println("Hello, " + name + "! Let`s go to code!");
    }

    void sendEmail(String recipientAddress, String emailContent){
        System.out.println("____________");
        System.out.println("| Email to: " + recipientAddress + " |");
        System.out.println("|********************|");
        System.out.println("| Message            |");
        System.out.println("| " + emailContent + " |");
        System.out.println("|********************|");

    }


    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ramMemory=" + ramMemory +
                ", numberOfCpus=" + numberOfCpus +
                ", isUsed=" + isUsed +
                '}';
    }
}





