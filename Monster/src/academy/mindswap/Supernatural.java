package academy.mindswap;

public class Supernatural {
    private int damageLevel;
    private int healthLevel;

    public Supernatural(int damageLevel, int healthLevel) {
        this.damageLevel = damageLevel;
        this.healthLevel = healthLevel;
    }

    public int attack() {
        return this.damageLevel;
    }


    public int getHealthLevel() {
        return Math.max(healthLevel, 0);
    }


    public int setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
        return healthLevel;
    }

}
