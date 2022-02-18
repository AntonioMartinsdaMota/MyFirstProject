package academy.mindswap;



public class Game {

    private int roundCounter = 0;
    private int numberOfMonsters;
    private boolean isGameOver;
    private Player player1;
    private Player player2;


    public Game(int numberOfMonsters) {

        this.numberOfMonsters = numberOfMonsters;
        this.isGameOver = false;
    }

    public void start() {
        System.out.println("");
        System.out.println("Welcome to the Game of Monsters:");
        System.out.println("");
        player1.pickMonsters(numberOfMonsters);
        System.out.println("   ");
        player2.pickMonsters(numberOfMonsters);
        System.out.println("");
        System.out.println("The game starts now:");

        while (!isGameOver()) {
            roundMaker();
        }
    }

    public void checkWinner(){
        if (player1.getAliveMonsterCount() == 0){
            System.out.println("      " + player2.getName());
            return;
        }
        if (player2.getDeadMonstersCounter() == 0){
            System.out.println("      " + player1.getName());
        }
    }

    public boolean isGameOver(){
        System.out.println();
        System.out.println(player1.getName() + " has " + player1.getAliveMonsterCount() + " alive monsters");
        System.out.println(player2.getName() + " has " + player2.getAliveMonsterCount() + " alive monsters");
        if (player1.getAliveMonsterCount() == 0 || player2.getAliveMonsterCount() == 0) {
            System.out.println("");
            System.out.println("The game is over");
            return true;
        }

        return false;
    }



    public void roundMaker() {

        if (roundCounter % 2 == 0) {
            player1.defend(player2.attack());
           // System.out.println("-------");

        } else {
            player2.defend(player1.attack());
        }
        roundCounter++;

       // System.out.println("-------");

    }


    public void setPlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
