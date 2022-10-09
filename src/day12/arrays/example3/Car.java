package day12.arrays.example3;

public class Car {

    String carBrand;
    double price;

    public Car(String carBrand, double price) {
        this.carBrand = carBrand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", price=" + price +
                '}';
    }
}
