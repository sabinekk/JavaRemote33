package day12.arrays.example2;

import java.util.Arrays;

public class BusMain {
    public static void main(String[] args) {

        Bus fancyBus = new Bus("Volvo", 150);
        Bus regularBus = new Bus("Mercedes", 120);

        Bus[] busGarage = new Bus[3];
        busGarage[0] = fancyBus;
        //place nr1 in the garage array is empty
        busGarage[2] = regularBus;
        System.out.println(Arrays.toString(busGarage));


    }
}
