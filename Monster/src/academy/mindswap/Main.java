package academy.mindswap;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(7);
        Player player1 = new Player("Joana");
        Player player2 = new Player("Antonio");

        game.setPlayers(player1, player2);


        game.start();
        System.out.println("------------------");
        System.out.println("And the winner is:");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        V");
        game.checkWinner();


    }


}
