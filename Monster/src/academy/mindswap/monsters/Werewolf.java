package academy.mindswap.monsters;

import academy.mindswap.monsters.Monster;

public class Werewolf extends Monster {


    public Werewolf() {
        super(3, 6);
    }

    @Override
    public int attack() {
        System.out.println("Werewolf attacked with " + getDamageLevel() + " damage points");
        return super.attack();
    }

    @Override
    public void getHit(int damageLevel) {
        super.getHit(damageLevel);
        System.out.println("Werewolf was hit and health level is: " + getHealthLevel() + "hp");
        if (getHealthLevel() <= 0) {
            System.out.println("Werewolf is dead");

        }
    }

    @Override
    public String toString() {
        return "Werewolf";
    }
}
