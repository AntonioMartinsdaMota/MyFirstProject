package academy.mindswap;

public class Bank {

    private String bankName;
    private Account[] accounts;



    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new Account[100];

    }

    public int createCreditAccount(int clientID) {
        if (checkIfCanCreateCredit(clientID)) {
            for (int i = 1; i < accounts.length; i++) {
                if (accounts[i] == null) {
                    accounts[i] = new Credit(clientID);
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean checkIfCanCreateCredit(int clientID) {
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getClientID() == clientID && accounts[i] instanceof Credit) {
                    return false;
                }
            }
        }
        return true;
    }

    public int createDebitAccount(int clientID) {

        if (checkIfCanCreateDebit(clientID)) {
            for (int i = 1; i < accounts.length; i++) {
                if (accounts[i] == null) {
                    accounts[i] = new Debit(clientID);
                    return i;
                }
            }
        }

        return -1;

    }

    public boolean checkIfCanCreateDebit(int clientID) {
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getClientID() == clientID && accounts[i] instanceof Debit) {
                    return false;
                }
            }
        }
        return true;
    }

}









