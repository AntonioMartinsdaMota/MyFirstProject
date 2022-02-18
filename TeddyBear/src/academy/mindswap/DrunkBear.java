package academy.mindswap;

public class DrunkBear extends Bear {

    private boolean isSleeping;

    public DrunkBear(String name) {
        super(name);
    }


    @Override
    public void talk() {
        if (!isSleeping) {
            super.talk();
            gettingAsleep();
        } else {
            fallingAsleep();
        }
    }

    public void fallingAsleep() {
        if(super.getBattery() > 0) {
            super.setBattery(super.getBattery()-10);
            System.out.println("Zzzzz Zzzzz Zzzzz ...");
            return;
        }
        System.out.println("No Battery");
    }

    public void gettingAsleep() {
        int randomNumber = (int) (Math.random() * 5 + 1);
        if (randomNumber <= 1) {
            isSleeping = true;
        }

    }

}








