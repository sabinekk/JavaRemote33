package day4.warmup;

public class TV {
    // adding "final" before String will finalize the name, it will be like that the whole program
    String brand;
    double screenResolution;
    double price;
    double lenght;
    double widgh;
    String color;
    boolean isOn; // false by default

    void getTVStatus () {
        System.out.println("TV is ON " + isOn);
    }

    void changeTVState (){
        if (isOn) {
            System.out.println("TV is turning off. Bye!");
            isOn = false; // this code will be executed if isOn variable = true
        } else {
            System.out.println("TV is turning on. Hello!");
            isOn = true; //this code will be executed if isOn variable = false
        }
    }

    void singOutANumber (int magicalNumber){ //with int you specify you want to see only this range numbers here
        System.out.println("Siiiiiiiiiingiinggg ouuuuttt nuuuumbeeer " + magicalNumber);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", screenResolution=" + screenResolution +
                ", price=" + price +
                ", lenght=" + lenght +
                ", widgh=" + widgh +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
