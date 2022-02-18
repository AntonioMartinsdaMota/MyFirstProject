package academy.mindswap;

public class ATM {
    private String bankName;
    private Card card;
    private boolean isPinCorrect;
    private boolean isCardIn;
    private boolean isPinIntroduced;
    private boolean withDrawSuccessful;

    public ATM(String bankName) {
        this.bankName = bankName;
    }

    public Card giveCardToClient() {
        return CardFactory.createCard();
    }


    public void introduceCard(Card card) {
        this.card = card;
        isCardIn = true;
        System.out.println("Your card is introduced");
    }

    public void removeCard(Card card) {
        this.card = card;
        isCardIn = false;
        System.out.println("Your card is removed");
    }

    public void introducePin(int pin) {
        if (this.card.getPin() == pin) {
            System.out.println("Pin is correct you can proceed");
            isPinCorrect = true;
            isPinIntroduced = true;
            return;
        }
        isPinCorrect = false;
        System.out.println("Pin is wrong");
    }

    public int withDraw(int amount) {
        withDrawSuccessful = false;
        if (!isCardIn) {
            System.out.println("Please introduce card first");
            return 0;
        }

        if (!isPinIntroduced) {
            System.out.println("Please introduce Pin first");
            return 0;
        }
        if (isPinCorrect && isPinIntroduced && card.getBalance() >= amount) {
            System.out.println("You have successfully withdrew " + amount + " €");
            card.setBalance(card.getBalance() - amount);
            withDrawSuccessful = true;
            return amount;
        }
        if (isPinCorrect && isPinIntroduced && card.getBalance() < amount) {
            System.out.println("Not enough balance, reduce amount or make a deposit");
            return 0;
        }

        System.out.println("Wrong Pin, please introduce Pin again");
        return 0;
    }

    public void deposit(int amount) {
        if (!isCardIn) {
            System.out.println("Please introduce card first");
            return;
        }
        if (isPinCorrect) {
            System.out.println("You have successfully deposit " + amount + " €");
            card.setBalance(card.getBalance() + amount);
            return;
        }
        System.out.println("Wrong Pin, please introduce pin again");
    }

    public void checkCardBalance() {
        if (!isCardIn) {
            System.out.println("Please introduce card first");
            return;
        }
        if (isPinCorrect) {
            System.out.println("Your balance is: " + card.getBalance() + " €");
            return;
        }
        System.out.println("Wrong Pin, please introduce pin again");
    }

    public boolean isCardIn() {
        return isCardIn;
    }

    public boolean isWithDrawSuccessful() {
        return withDrawSuccessful;
    }
}



