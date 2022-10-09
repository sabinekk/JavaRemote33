package day13.warmUp;

import java.util.Arrays;

public class Child {

    String name;
    int age;
    int[] favouriteNumbers;
    Toy[] favouriteToys;

    public Child(String name, int age, int[] favouriteNumbers) {
        this.name = name;
        this.age = age;
        this.favouriteNumbers = favouriteNumbers;
    }

    public Child() {
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteNumbers=" + Arrays.toString(favouriteNumbers) +
                ", favouriteToys=" + Arrays.toString(favouriteToys) +
                '}';
    }
}

