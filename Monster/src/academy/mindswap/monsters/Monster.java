package academy.mindswap.monsters;

import academy.mindswap.Supernatural;

public abstract class Monster extends Supernatural implements Attackable {


    private boolean isDead;

    public Monster(int damageLevel, int healthLevel) {
        super(damageLevel,healthLevel);
    }

    public boolean isDead(){
        if (getHealthLevel() <= 0){
           return true;
        }
        return false;
    }

    public int getDamageLevel() {
        return getDamageLevel();
    }


    public void getHit(int damageLevel) {
        setHealthLevel(getHealthLevel()-damageLevel);
    }
}