package day8.constructors;

public class Cake {

    String filling;
    int numberOfLayers;
    Boolean isVegan;

    Cake () {
        System.out.println("We got a cake :) ");
    }

    public Cake(String filling, int numberOfLayers, Boolean isVegan) {
        this.filling = filling;
        this.numberOfLayers = numberOfLayers;
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "filling='" + filling + '\'' +
                ", numberOfLayers=" + numberOfLayers +
                ", isVegan=" + isVegan +
                '}';
    }
}
