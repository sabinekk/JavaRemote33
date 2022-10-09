package day16.task;

public class Resident {

    String name;

    public Resident(String name) {
        this.name = name;
    }

    void doSpecificChore (Chore chore) {
        System.out.println("Doing chore " + chore.nameOfTheChore + " for " + chore.durationOfTheChore + "min");
    }

    @Override
    public String toString() {
        return "Resident{" +
                "name='" + name + '\'' +
                '}';
    }
}
