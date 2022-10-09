package day12.arrays.example3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraytester {

    public static void main(String[] args) {

        int numberOne = 3;
        int numberTwo = 5;
        int numberThree = 77;

        int[] threeNumbers = new int[3];
        threeNumbers[0] = numberOne;
        threeNumbers[1] = numberTwo;
        threeNumbers[2] = numberThree;
        threeNumbers[2] = 88;
        //Last number changed
        System.out.println(Arrays.toString(threeNumbers));
        threeNumbers[0] = numberOne;
        threeNumbers[1] = numberTwo;
        threeNumbers[2] = 88;
        System.out.println(Arrays.toString(threeNumbers));

        String[] twoWords = new String[2];
        twoWords[0] = "Banana";
        twoWords[1] = "Apple";
        System.out.println(Arrays.toString(twoWords));

        Car newCar = new Car("Audi", 50000);
        Car betterNewCar = new Car("Porsche", 100100);

        Car[] carArray = new Car[2];
        carArray[0] = newCar;
        carArray[1] = betterNewCar;
        System.out.println(Arrays.toString(carArray));



    }

}
