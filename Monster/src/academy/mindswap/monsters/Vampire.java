package academy.mindswap.monsters;

import academy.mindswap.monsters.Monster;

public class Vampire extends Monster {
    public Vampire() {
        super(1, 6);
    }

    @Override
    public int attack() {
        int randomGenerate = (int) (Math.random() * (3 - 1 + 1)) + 1;
        if (randomGenerate == 3){
            setHealthLevel(getHealthLevel() + 2);
            System.out.println("Vampire attacked with " + getDamageLevel() + " damage points" + " and gained 5 health points");
        }
        System.out.println("Vampire attacked with " + getDamageLevel() + " damage points");
        return super.attack();
    }

    @Override
    public void getHit(int damageLevel) {
        super.getHit(damageLevel);
        System.out.println("Vampire was hit and health level is: " + getHealthLevel() + "hp");
        if (getHealthLevel() <= 0) {
            System.out.println("Vampire is dead");

        }
    }

    @Override
    public String toString() {
        return "Vampire";
    }
}
