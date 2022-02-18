package academy.mindswap;

public class Client {

    public static int clientCounter = 0;
    private int idNumber;
    private String clientName;
    private boolean hasCreditAccount;
    private boolean hasDebitAccount;


    public Client(String clientName) {
        this.idNumber = ++clientCounter;
        this.clientName = clientName;
    }

    public void createCreditAccount(Bank bank) {
        int accountCredit = bank.createCreditAccount(idNumber);
        if ( accountCredit != -1) {

            System.out.println("You created a credit account: " + accountCredit );
            return;
        }
        System.out.println("You cant create another account on this Bank, please go to another.");

    }

    public void createDebitAccount(Bank bank) {
        int accountDebit = bank.createDebitAccount(idNumber);
        if (accountDebit  != -1) {

            System.out.println("You created a debit account: " + accountDebit);
            return;
        }
        System.out.println("You cant create another account on this Bank, please go to another.");

    }


    public void depositDebit(Bank bank, int amount,Debit debit) {

        Account clientAccount = bank.getAccounts()[idNumber];
        if (bank.checkIfCanCreateDebit(idNumber)) {
            clientAccount.setDebitBalance(clientAccount.getDebitBalance() + amount);
            System.out.println("You deposited " + amount);
            return;
        }
        System.out.println("Create debit account first");

    }



    public void knowBalance(Bank bank, String accountType) {
        Account clientAccount = bank.getAccounts()[idNumber];
        if (clientAccount.getAccountType().equals("Credit")) {
            System.out.println(clientAccount.getCreditBalance());
            return;
        }
        if (clientAccount.getAccountType().equals("Debit")) {
            System.out.println(clientAccount.getDebitBalance());
        }

    }








*/








    public static int getClientCounter() {
        return clientCounter;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public boolean isHasCreditAccount() {
        return hasCreditAccount;
    }

    public void setHasCreditAccount(boolean hasCreditAccount) {
        this.hasCreditAccount = hasCreditAccount;
    }

    public boolean isHasDebitAccount() {
        return hasDebitAccount;
    }

    public void setHasDebitAccount(boolean hasDebitAccount) {
        this.hasDebitAccount = hasDebitAccount;
    }
}

