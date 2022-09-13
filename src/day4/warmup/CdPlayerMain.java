package day4.warmup;

public class CdPlayerMain {
    public static void main(String[] args) {

        CD CdPlayer = new CD();
        CdPlayer.price = 29.99;
        CdPlayer.volume = 75;
        CdPlayer.currentSong = "Good one";


        System.out.println();

        CdPlayer.getCurrentSong();
        CdPlayer.changeSong();
        CdPlayer.changeSong();

        System.out.println();

        CdPlayer.changeState();
        CdPlayer.changeState();
        CdPlayer.turnVolumeOn(34);

    }



}
