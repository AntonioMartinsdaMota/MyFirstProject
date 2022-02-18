package com.mindera.mindswap;

public enum PlayTypes {


    ROCK_ENUM("Rock"),
    PAPER_ENUM("Paper"),
    SCISSORS_ENUM("Scissors");

    private String choice;

    PlayTypes(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }
}
