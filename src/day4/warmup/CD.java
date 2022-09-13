package day4.warmup;

public class CD {

    //few fields (isOn, volume, String currentSong, price) for state and few methods to define
    // behavior. turnOn, turnOff, getCurrentSong, changeSong, get price.

    boolean isOn;
    int volume = 50;


    String currentSong;
    boolean songGood;
    double price;


    void changeState () {
        if (isOn) {
            System.out.println("CD player is off.");
            isOn = false;
        } else {
            System.out.println("CD player is on.");
            isOn = true;
        }
    }

    void getCurrentSong () {
        System.out.println("Currently playing " + currentSong);
    }

    void changeSong () {
        if (songGood) {
            System.out.println("Change the song!");
            songGood = false;
    } else {
            System.out.println("Keep playing song!");
            songGood = true;
        }
    }
    void getPrice () {
        System.out.println("The current price of the CD player is " + price);
    }

    void turnVolumeOn (int volume) {
        System.out.println("The volume is " + volume);
    }

}
