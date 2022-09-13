package day3.example2;

/**
 * This is a blueprint or a recipe witch we will use to create OBJECTS.
 */

public class Car {
    /**
     * variables define the state/appearance of the object we create
      */
    int numberOfWheels = 4; //integer defines number of wheels
    int maxSpeed;
    double price;

    void go() {
        System.out.println("Car is going. ");
    }

    void startEngine () {
        System.out.println("Engine is started!");
    }

}
