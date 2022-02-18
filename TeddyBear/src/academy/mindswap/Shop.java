package academy.mindswap;

public class Shop {

    private int bearsCounter;

    public Shop() {

        bearsCounter = 0;
    }

    public Bear createBear() {

        bearsCounter++;

        if(bearsCounter%2 == 0) {

            String name = "Bear" + bearsCounter;
            SimpleBear bear = new SimpleBear(name);
            return bear;
        }
        if(bearsCounter%5 == 0){


            String name = "Bear" + bearsCounter;
            CrankyBear crankyBear = new CrankyBear(name);
            return crankyBear;

        }

        String name = "Bear" + bearsCounter;
        DrunkBear drunkBear = new DrunkBear(name);
        return drunkBear;
    }

    public int getBearsCounter() {
        return bearsCounter;
    }
}
