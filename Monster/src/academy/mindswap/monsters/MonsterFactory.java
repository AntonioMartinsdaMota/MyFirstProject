package academy.mindswap.monsters;

import academy.mindswap.monsters.Monster;
import academy.mindswap.monsters.Mummy;
import academy.mindswap.monsters.Vampire;
import academy.mindswap.monsters.Werewolf;

public class MonsterFactory {

    private static int monsterRandomGen;

    public static Monster createMonster() {



        monsterRandomGen = (int) (Math.random() * 3);;

        if (monsterRandomGen == 0) {
            Werewolf werewolf = new Werewolf();
            return werewolf;
        }
        if (monsterRandomGen == 1) {
            Vampire vampire = new Vampire();
            return vampire;

        }
        Mummy mummy = new Mummy();
        return mummy;
    }
}




