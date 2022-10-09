package day12.arrays.example2;

public class Bus {

    String brand;
    int speed;

    public Bus(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
