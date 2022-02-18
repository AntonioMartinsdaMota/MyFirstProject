package academy.mindswap.monsters;

import academy.mindswap.monsters.Monster;

public class Mummy extends Monster {

    private static int attackCounter = 0;

    public Mummy() {
        super(2, 6);
    }

    @Override
    public int attack() {
        if(attackCounter >= 2){
            attackCounter = 0;
            setHealthLevel(getHealthLevel()-2);
            System.out.println("Mummy missed the attack and lost 2 hp");
            return 0;
        }
        attackCounter++;
        System.out.println("Mummy attacked with " + getDamageLevel() + " damage points");
        return super.attack();

    }

    @Override
    public void getHit(int damageLevel) {
        super.getHit(damageLevel);
        System.out.println("Mummy was hit and health level is: " + getHealthLevel() + "hp");
        if (getHealthLevel() <= 0) {
            System.out.println("Mummy is dead");
        }
    }

    @Override
    public String toString() {
        return "Mummy";
    }
}
