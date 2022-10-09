package day13.warmUp;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Child billy = new Child();
        billy.name = "Billy";
        billy.age = 2;
        int [] billysFavNumbers = new int[3];
        billysFavNumbers[0] = 10;
        billysFavNumbers[1] = 13;
        billysFavNumbers[2] = 22;
        billy.favouriteNumbers = billysFavNumbers;
        System.out.println(billy);

        int[] annsFavNumbers = {4,2,9, 10, 5};
        Child ann = new Child("Ann", 3, annsFavNumbers);
        System.out.println(ann);

        Toy teddyBear = new Toy("Teddy");
        Toy barbyDoll = new Toy("Barbie");
        Toy[] favToys = {teddyBear, barbyDoll};
        System.out.println(favToys.length);
        ann.favouriteToys = favToys;
        System.out.println(ann);

        //For loop izmanto
        // pirmais apzīmē ar ko sākās loop - index = 0 - define place where to start
        //otrais cipars apzīmē to cik ilgi šīs loop strādās, piem, kamēr izpildās uzstādījums indekss ir mazāks par 5
        //trešais norāda uz to, kas notiek katru reizi ar šo loop -> ++ nozīmē to, ka pieskaita katru reizi +1
        for (int index = 0; index < 5 ; index++ ){
            System.out.println("Index is " + index);
        }

        for (Toy favToy : favToys) {
            System.out.println(favToy);
        }
        //regular for loop
        for (int index = 0; index < annsFavNumbers.length; index++){
            System.out.println(annsFavNumbers[index]);
        }
        //katru otro izprintē
        for (int index = 0; index < annsFavNumbers.length; index = index + 2){
            System.out.println("Every second number of Anns list is: " + annsFavNumbers[index]);
        }
        //foreach loop pr enchanted for loop
        for (Toy favToy : favToys) {
            System.out.println(favToy.name);
        }

        //will print this out forever as long as there is electricity or memory on the PC as this is true always
//        while (true) {
//            System.out.println("Whoops!");
//        }

        //boolean is true in the first run, then it is defined as false and the loop stops
        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("Whoops!");
            shouldRun = false;
        }

        boolean runProgram = true;
        Scanner scanner = new Scanner(System.in);

        while (runProgram) {
            System.out.println("Enter a number or enter 0 to exit.");
            int userNumber = scanner.nextInt();
            System.out.println("You entered number is: " + userNumber);
            if (userNumber == 0){
                runProgram = false;
            }

        }

        //kā nodrošināt to, ka vienmēr ir vieta jaunam variable un tā nebeidzas
        //int[] copy = billysFavNumbers;
        //if (marginExceeded) {
         //   int newArraysSize = billysFavNumbers.length*2;
        //    billysFavNumbers = new int[newArraysSize];
      //  }


    }
}
