package day12.arrays.example4;

public class Participant {

    String name;
    int experience;

    public Participant(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    void discussAboutProgramming() {
        System.out.println("Talking about programming...");
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
