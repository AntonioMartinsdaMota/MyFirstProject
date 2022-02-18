package academy.mindswap;

import academy.mindswap.products.TypesOfProducts;

public class Main {

    public static void main(String[] args) {

        ATM santanderATM = new ATM("Santander");
        ATM appleATM = new ATM("Apple");
        Client client1 = new Client("Antonio");
        Shop apple = new Shop(10,"Apple");




        client1.introduceCard(santanderATM);

        client1.askForCard(santanderATM);

        client1.introduceCard(santanderATM);

        client1.withDraw(100);

        client1.introducePin(5);

        client1.introducePin(1);

        client1.withDraw(100);

        client1.checkCardBalance();

        client1.deposit(500);

        client1.withDraw(100);

        System.out.println(client1.checkWalletBalance());

        client1.checkCardBalance();

        client1.withDraw(600);

        client1.introduceCard(santanderATM);

        client1.removeCard(santanderATM);

        client1.removeCard(santanderATM);

        System.out.println("");

        client1.buy(TypesOfProducts.COMPUTER);
        client1.goToShop(apple);

        System.out.println("");
        client1.buy(TypesOfProducts.COMPUTER);
        System.out.println("");
        apple.buyProducts(TypesOfProducts.COMPUTER);
        System.out.println(apple.checkQuantity(TypesOfProducts.COMPUTER));
        client1.buy(TypesOfProducts.COMPUTER);
        apple.attendClient(client1);
        client1.buy(TypesOfProducts.COMPUTER);
        System.out.println(client1.checkWalletBalance());


        //cliente foi a uma atm dentro da loja;

        client1.introduceCard(appleATM);
        client1.introducePin(1);
        client1.deposit(5000);
        client1.withDraw(3500);
        client1.removeCard(appleATM);

        client1.buy(TypesOfProducts.COMPUTER);
        System.out.println(apple.checkQuantity(TypesOfProducts.COMPUTER));
        System.out.println("You have: " + client1.checkWalletBalance() + " € in your wallet");

        client1.buy(TypesOfProducts.PHONE);
        client1.buy(TypesOfProducts.TV);

        System.out.println("");

        apple.buyProducts(TypesOfProducts.PHONE);
        apple.buyProducts(TypesOfProducts.TV);

        System.out.println("");
        client1.buy(TypesOfProducts.PHONE);
        client1.buy(TypesOfProducts.TV);
        client1.buy(TypesOfProducts.COMPUTER);

        System.out.println("You have: " + client1.checkWalletBalance() + " € in your wallet");

        apple.buyProducts(TypesOfProducts.COMPUTER);
        apple.buyProducts(TypesOfProducts.COMPUTER);
        apple.buyProducts(TypesOfProducts.COMPUTER);
        apple.buyProducts(TypesOfProducts.COMPUTER);
        apple.buyProducts(TypesOfProducts.COMPUTER);

        System.out.println("");

        apple.getFinances();

        System.out.println("");

        client1.buy(TypesOfProducts.COMPUTER);

        System.out.println("");

        client1.introduceCard(appleATM);
        client1.introducePin(1);
        client1.deposit(5000);
        client1.withDraw(3500);
        client1.removeCard(appleATM);

        System.out.println("");

        client1.buy(TypesOfProducts.COMPUTER);

        System.out.println("");

        apple.getFinances();
        System.out.println("You have: " + client1.checkWalletBalance() + " € in your wallet");

        client1.buy(TypesOfProducts.COMPUTER);

        System.out.println("");

        apple.getFinances();
        apple.buyProducts(TypesOfProducts.PHONE);
        apple.buyProducts(TypesOfProducts.PHONE);
        apple.buyProducts(TypesOfProducts.PHONE);

        apple.getFinances();


        client1.buy(TypesOfProducts.COMPUTER);
        System.out.println(client1.checkWalletBalance());

        System.out.println("");

        client1.introduceCard(appleATM);
        client1.introducePin(1);
        client1.deposit(5000);
        client1.withDraw(3500);
        client1.removeCard(appleATM);

        client1.buy(TypesOfProducts.COMPUTER);






























    }
}
