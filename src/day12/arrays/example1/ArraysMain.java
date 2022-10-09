package day12.arrays.example1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {

        int numberOne = 2;
        int numberTwo = 9;
        int numberThree = -6;
        int numberFour = 786;

        int[] lonelyNumbers = {numberOne, numberTwo, numberThree, numberFour};
        System.out.println(Arrays.toString(lonelyNumbers));

        //"[]" -> means that this will be an array
        //Array is an object in java
        /**
         * int -> type
         * [] -> array
         * funNumbers -> variable name
         * new int[4] -> java keyword to create an object
         * [4] -> specifies size of an array
         */
        int [] funNumbers = new int[6];

        funNumbers[0] = 985;
        funNumbers[1] = 13;
        funNumbers[2] = 1555;
        funNumbers[3] = 99;

        System.out.println(Arrays.toString(funNumbers));

    }
}
