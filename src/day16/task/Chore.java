package day16.task;

public class Chore {

    String nameOfTheChore;
    int durationOfTheChore;

    public Chore(String nameOfTheChore, int durationOfTheChore) {
        this.nameOfTheChore = nameOfTheChore;
        this.durationOfTheChore = durationOfTheChore;
    }



    @Override
    public String toString() {
        return "Chore{" +
                "nameOfTheChore='" + nameOfTheChore + '\'' +
                ", durationOfTheChore=" + durationOfTheChore +
                '}';
    }
}
