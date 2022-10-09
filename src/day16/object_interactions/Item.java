package day16.object_interactions;

public class Item {

    String lable;

    public Item(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "Item{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
