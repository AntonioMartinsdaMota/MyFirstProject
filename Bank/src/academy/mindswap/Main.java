package academy.mindswap;

public class Main {

    public static void main(String[] args) {


        Bank bank1 = new Bank("Milenium");
        Client client1 = new Client("Martim");
        Client client2 = new Client("Tony");



        client1.createCreditAccount(bank1);
        client1.createCreditAccount(bank1);
        client1.createDebitAccount(bank1);
        client2.createDebitAccount(bank1);

        client1.deposit(bank1, 1, 23.0);



        Bank bank2 = new Bank("Santander");
        client1.createCreditAccount(bank2);

     //   client1.depositDebit(bank1,50);

        System.out.println(client1.getIdNumber());
        System.out.println(client2.getIdNumber());







    }
}





















/*Customers can create accounts on different banks
A customer can have 2 accounts per bank: 1 Debit and 1 credit
A customer must ask cards to the bank before using cards
A customer can deposit money on credit or debit accounts
A customer may withdraw money only from debit card
A customer may pay with both cards
Only credit card allows payments with negative balance but will have a fee every time it occurs
Credit balance can't go below -100€ (or some value you choose when creating accounts)

*/