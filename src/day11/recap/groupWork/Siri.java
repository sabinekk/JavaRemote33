package day11.recap.groupWork;

public class Siri {

    String name;
    int version;
    double price;
    String language;


    public Siri(String name, int version, double price, String language) {
        this.name = name;
        this.version = version;
        this.price = price;
        this.language = language;
    }

    public void siriSayHello(String welcomeMessage) {
        System.out.println(welcomeMessage);
    }

    public void playSpotify(String songToPlay){
        System.out.println("Playing:");
    }

    public int addTwoNumbers(int numberOne, int numberTwo){
        if (numberOne >0 && numberTwo >0) {
            return numberOne + numberTwo;
        }else {
            System.out.println("Calculation cannot be made!");
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Siri{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", price=" + price +
                ", language='" + language + '\'' +
                '}';
    }
}
