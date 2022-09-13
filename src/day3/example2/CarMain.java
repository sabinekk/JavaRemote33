package day3.example2;

public class CarMain {
    public static void main(String[] args) {
        int age = 5; // type(int) name(age) = value(5);
        Car ferrari = new Car(); // new Car (); -> creates an object in memory;
        ferrari.startEngine();
        ferrari.go();
        System.out.println("Ferrari has " + ferrari.numberOfWheels + " wheels.");
        ferrari.numberOfWheels = 8;
        System.out.println("Ferrari has " + ferrari.numberOfWheels + " wheels.");
        System.out.println("Ferrari price is " + ferrari.price);
        System.out.println("Ferrari max speed is " + ferrari.maxSpeed);


        System.out.println();

        Unicorn unicornTom = new Unicorn();
        unicornTom.colour = "Purple";
        unicornTom.hasWings = true;
        unicornTom.hasHorn = true;
        unicornTom.intoruce();
        unicornTom.shine();
        unicornTom.fly();

        System.out.println();
        Person dude = new Person();
        dude.isLatvian = true;
        dude.introduction();
        dude.person();
        dude.looks();
        dude.tall();
        dude.hobby();
        dude.nationality();


    }
}

