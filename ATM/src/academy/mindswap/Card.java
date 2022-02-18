package academy.mindswap;

public class Card {
    private int idNumber;
    private int pin;
    private int balance;
    private  boolean isIntroduced;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public Card(int idNumber, int pin) {
        this.idNumber = idNumber;
        this.pin = pin;
        this.balance = 0;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getPin() {
        return pin;
    }

    public boolean isIntroduced() {
        return isIntroduced;
    }

    public void setIntroduced(boolean introduced) {
        isIntroduced = introduced;
    }
}
