package academy.mindswap;

public class Game {

    public void guessNumber(int player1Guess, int player2Guess, Utils utils, Player player1, Player player2) {

        System.out.println(player1.getName() + ":  " + player1Guess);
        System.out.println(player2.getName() + ":  " + player2Guess);

        if (player1Guess == player2Guess && player1Guess == utils.getNumberToGuess()) {
            System.out.println("Party, Both win");
        } else if (player1Guess == utils.getNumberToGuess()) {
            System.out.println(player1.getName() + " Wins");
        } else if (player2Guess == utils.getNumberToGuess()) {
            System.out.println(player2.getName() + " Wins");
        } else {
            System.out.println("No winners");
        }
    }

}
