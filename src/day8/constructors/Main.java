package day8.constructors;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        //new Phone is constructor of this class
        iPhone.brand = "Iphone X";
        iPhone.price = 500.00;
        iPhone.yearManufactured = 2020;
        iPhone.isUsed = true;
        iPhone.colour = "Black";
        System.out.println(iPhone);

        Phone samsung = new Phone("Samsung 15", 600.0, 2021, false, "White");

        System.out.println(samsung);

        Cake chocolateCake = new Cake();
        System.out.println(chocolateCake);

        Cake classicCake = new Cake("Cream", 3, true);
        System.out.println(classicCake);

    }


}
