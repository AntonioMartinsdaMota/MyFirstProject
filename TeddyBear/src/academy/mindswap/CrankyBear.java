package academy.mindswap;

import org.w3c.dom.ls.LSOutput;

public class CrankyBear extends Bear {

    private int songsCounter;


    public CrankyBear(String name) {
        super(name);
    }

    @Override
    public void talk() {
        if (super.getBattery() >= 50) {
            super.talk();
            return;
        }
        System.out.println("No battery enough to talk");
    }



    public void sing() {

        if(songsCounter == 0 && super.getBattery() < 50 ) {
                System.out.println("Lonely, I'm Mr. Lonely, I have nobody for my own...");
                songsCounter++;
                return;
            } if (songsCounter == 0 && super.getBattery() >= 50 ){
                System.out.println("I can't Sing, I have too much battery");
                return;
        }   if(songsCounter != 0)
            System.out.println("I can't Sing, I already sang before");
    }
}