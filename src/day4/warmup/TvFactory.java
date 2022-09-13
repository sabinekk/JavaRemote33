package day4.warmup;

public class TvFactory {
    public static void main(String[] args) {

        TV myFirstTV = new TV(); // to create an integer we do int age = 5;
        myFirstTV.price = 199.99;
        myFirstTV.screenResolution = 36.0;
        myFirstTV.color = "Grey";
        myFirstTV.lenght = 60.0;
        myFirstTV.widgh = 80.0;
        myFirstTV.brand = "Samsung";

        // variables are for data storage
        String tvInfo = myFirstTV.toString();
        System.out.println(tvInfo);

        myFirstTV.getTVStatus();
        myFirstTV.changeTVState();
        myFirstTV.getTVStatus();

        myFirstTV.singOutANumber(65432);



    }
}
