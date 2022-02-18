package academy.mindswap;

public abstract class Account {

    private static int accountCounter = 0;
    private String accountType;
    private int accountNumber;
    private int clientID;
    private int balance;


    public Account(int clientID) {
        this.accountNumber = ++accountCounter;
        this.clientID = clientID;
        this.balance=0;

    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getClientID() {
        return clientID;
    }

    public int getBalance() {
        return balance;
    }

}
