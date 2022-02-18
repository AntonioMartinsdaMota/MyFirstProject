package com.mindera.mindswap;

public class Game {

    private final String p1;
    private final String p2;
    private final PlayTypes[] choices;

    public Game(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
        choices = PlayTypes.values();
    }

    public void start(int maxRounds) {
        PlayTypes p1Hand;
        PlayTypes p2Hand;
        int p1Wins = 0;
        int p2Wins = 0;
        int roundsPlayed = 0;

        while (roundsPlayed < maxRounds) {

            p1Hand = pickHand();
            p2Hand = pickHand();

            printPicks(p1Hand, p2Hand);

            if (p1Hand.equals(p2Hand)) {
                System.out.println("It's a draw!");
                continue;
            }

            String winner = checkWinner(p1Hand, p2Hand);
            roundsPlayed++;

            if (winner.equals(p1)) {
                p1Wins++;
            } else {
                p2Wins++;
            }

            System.out.println(winner + " wins this round!");
        }

        printResults(p1Wins, p2Wins);
    }

    private PlayTypes pickHand() {
        return choices[RandomGenerator.generateRandom(choices.length)];
    }

    private void printPicks(PlayTypes p1Hand, PlayTypes p2Hand) {
        System.out.println(p1 + " picked: " + p1Hand.getChoice() + ".");
        System.out.println(p2 + " picked: " + p2Hand.getChoice() + ".");
    }

    private String checkWinner(PlayTypes p1Hand, PlayTypes p2Hand) {
        String winner = p1;

        switch (p1Hand) {
            case ROCK_ENUM:
                if (p2Hand == (PlayTypes.PAPER_ENUM)) {
                    winner = p2;
                }
                break;
            case PAPER_ENUM:
                if (p2Hand.equals(PlayTypes.SCISSORS_ENUM)) {
                    winner = p2;
                }
                break;
            case SCISSORS_ENUM:
                if (p2Hand.equals(PlayTypes.ROCK_ENUM)) {
                    winner = p2;
                }
                break;
        }

        return winner;
    }


    private void printResults(int p1Wins, int p2Wins) {
        String winnersName = p1Wins == p2Wins ? "No one. It's a tie!" :
                p1Wins > p2Wins ? p1 : p2;

        System.out.println("==============================");
        System.out.println("AND THE WINNER OF THE GAME IS: ");
        System.out.println(winnersName);
    }
}
