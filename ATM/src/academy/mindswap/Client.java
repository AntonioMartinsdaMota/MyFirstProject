package academy.mindswap;

import academy.mindswap.products.TypesOfProducts;

public class Client {
    private String name;
    private Card card;
    private boolean hasACard;
    private ATM atm;
    private int wallet;
    private Shop shop;

    public Client(String name) {
        this.name = name;
        this.wallet = 0;
    }

    public void introduceCard(ATM atm) {
        if (hasACard && !card.isIntroduced()) {
            atm.introduceCard(this.card);
            this.atm =atm;
            card.setIntroduced(true);
            return;
        }
        if (hasACard && card.isIntroduced()) {
            System.out.println("You already have a car in, please remove card first");
            return;
        }
        if (!hasACard) {
            System.out.println("You don't have a card yet");
            return;
        }
    }

    public void removeCard(ATM atm) {
        if (atm != null && hasACard && atm.isCardIn()) {
            atm.removeCard(this.card);
            card.setIntroduced(false);
            this.atm =null;
            return;
        }
        if (hasACard && !atm.isCardIn()) {
            System.out.println("You didn't insert any card");
            return;
        }
        if (!hasACard) {
            System.out.println("You don't have a card yet");
            return;
        }
    }


    public void askForCard(ATM atm) {
        if (this.card == null) {
            this.card = atm.giveCardToClient();
            hasACard = true;
            System.out.println(name + " You received a card with ID number: " + card.getIdNumber());
            return;
        }
        System.out.println(name + " You already have a card with ID number: " + card.getIdNumber());
    }



    public void withDraw(int amount) {
        if (atm == null) {
            return;
        }
        atm.withDraw(amount);
        if (atm.isWithDrawSuccessful()) {
            setWallet(checkWalletBalance() + amount);
        }
    }

    public void deposit(int amount){
        if (atm == null){
            return ;
        }
        atm.deposit(amount);
    }

    public void introducePin(int pin){
        if (atm == null){
            return ;
        }
        atm.introducePin(pin);
    }

    public void checkCardBalance(){
        if (atm == null){
            return ;
        }
        atm.checkCardBalance();
    }

    public void goToShop(Shop shop){
        System.out.println("You arrived to " + shop.getName());
        this.shop = shop;
    }

    public void buy(TypesOfProducts typesOfProducts){
        if(shop == null){
            System.out.println("You are not in the shop, please go to shop first");
            return;
        }
        int price = shop.sayProductPrice(typesOfProducts);
        if(wallet >= price){
            wallet-= price;
            shop.sellProductClient(typesOfProducts);
        }
    }



    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }
    public int checkWalletBalance() {
        return wallet;
    }


}
