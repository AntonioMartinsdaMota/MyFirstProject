package academy.mindswap;

public class BlackJack {

    private static int scorePlayer;
    private static int scoreDealer;
    private static int value;
    private static int score;
    private static int score1;


    public static int drawCardPlayer() {



        int cardValue = (int) (Math.random() * (13 - 1 + 1) + 1);
        if (cardValue == 11 || cardValue == 12 || cardValue == 13) {
            value = 10;
        } else {

            value = cardValue;
        }
        score += value;
        return value;

    }

    public static int drawCardDealer() {



        int cardValue = (int) (Math.random() * (13 - 1 + 1) + 1);
        if (cardValue == 11 || cardValue == 12 || cardValue == 13) {
            value = 10;
        } else {

            value = cardValue;
        }
        score1 += value;
        return value;

    }


    public static int getScorePlayer() {
        return score;
    }

    public static int getScoreDealer() {
        return score1;
    }

    public static int getValue() {
        return value;
    }

    public static int getScore() {
        return score;
    }
}