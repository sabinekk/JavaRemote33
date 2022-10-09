package day8.constructors;

import java.awt.*;

public class Phone {

    String brand;
    double price;
    int yearManufactured;
    boolean isUsed;
    String colour;

    //this is a constructor of a class
    //which is invisible by default
    Phone() {
        System.out.println("Constructor is invoked!");
        //works great if we need to decorate our objects
    }

    //parameterized constructor - alt+insert, / right click + generate + constructor
    //mostly used nowadays


    public Phone(String brand, double price, int yearManufactured, boolean isUsed, String colour) {
        this.brand = brand;
        this.price = price;
        this.yearManufactured = yearManufactured;
        this.isUsed = isUsed;
        this.colour = colour;
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", yearManufactured=" + yearManufactured +
                ", isUsed=" + isUsed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
