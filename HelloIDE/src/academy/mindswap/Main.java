package academy.mindswap;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("João");
        Player dealer = new Player("Dealer");

        do{BlackJack.drawCardPlayer();
            System.out.println("Antonio's Card: " +BlackJack.getValue() + "  |  " + "Antonio's Points: "+ BlackJack.getScorePlayer());

            if (BlackJack.getScorePlayer() >= 17 && BlackJack.getScorePlayer() < 21) {
                System.out.println("Hold!");
                break;
            }
            if (BlackJack.getScorePlayer() > 21){
                System.out.println("Booom!");
                break;
            }

        }while (BlackJack.getScorePlayer() < 21);

        do{BlackJack.drawCardDealer();
            System.out.println("Dealer's Card: " +BlackJack.getValue() + "  |  " + "Dealer's Points: "+ BlackJack.getScoreDealer());
            if (BlackJack.getScoreDealer() > 21){
                System.out.println("Booom!");
                break;
            }

        }while (BlackJack.getScoreDealer() < 21);

        if (BlackJack.getScorePlayer() < BlackJack.getScoreDealer()) {
            System.out.println("The winner is: " + player.getName());
        } else if(BlackJack.getScorePlayer() > 21) {
            System.out.println("The winner is: " + dealer.getName());

        }

    }
}