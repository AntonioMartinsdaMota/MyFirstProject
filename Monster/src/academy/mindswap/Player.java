package academy.mindswap;

import academy.mindswap.monsters.Monster;
import academy.mindswap.monsters.MonsterFactory;

public class Player {


    private String name;
    private Monster[] arrayOfMonsters;
    private int deadMonstersCounter = 0;


    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void pickMonsters(int numberOfMonsters) {
        arrayOfMonsters = new Monster[numberOfMonsters];
        for (int i = 0; i < arrayOfMonsters.length; i++) {
            arrayOfMonsters[i] = MonsterFactory.createMonster();
            System.out.println(name + " Pick: " + arrayOfMonsters[i]);
        }
    }

    public int getAliveMonsterCount() {
        int aliveCount = 0;
        for(int i = 0; i < arrayOfMonsters.length; i++) {
            Monster monster = arrayOfMonsters[i];
            if (monster != null && !monster.isDead()) {
                aliveCount++;
            }
        }
        return aliveCount;
    }

    public int getDeadMonstersCounter() {
        return deadMonstersCounter;
    }

    /*   for (int i = 0; i < arrayOfMonsters.length; i++) {
            if (arrayOfMonsters[i].isDead()) {
                deadMonstersCounter++;
            }
        }
    }*/

    public int attack() {
        return pickACard().attack();
    }

    public void defend(int damage) {
        pickACard().getHit(damage);
    }


    public Monster pickACard() {
        Monster[] arrayAlive = new Monster[arrayOfMonsters.length];
        int aliveMonstersCounter = 0;
        for (int i = 0; i < arrayOfMonsters.length; i++) {
            if (!arrayOfMonsters[i].isDead()) {
                arrayAlive[aliveMonstersCounter] = arrayOfMonsters[i];
                aliveMonstersCounter++;
            }
        }
        if(aliveMonstersCounter == 0){
            return null;
        }
        int randomPick = (int) (Math.random() * (aliveMonstersCounter));
            return arrayAlive[randomPick];

    }
}








