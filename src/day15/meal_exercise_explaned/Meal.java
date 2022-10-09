package day15.meal_exercise_explaned;

public class Meal {

    String userAddedName;
    String userAddedDecription;
    double userAddedPrice;

    public Meal(String userAddedName, String userAddedDecription, double userAddedPrice) {
        this.userAddedName = userAddedName;
        this.userAddedDecription = userAddedDecription;
        this.userAddedPrice = userAddedPrice;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "userAddedName='" + userAddedName + '\'' +
                ", userAddedDecription='" + userAddedDecription + '\'' +
                ", userAddedPrice=" + userAddedPrice +
                '}';
    }
}

