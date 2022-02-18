package academy.mindswap;

import academy.mindswap.products.*;

public class Shop {
    private TypesOfProducts[] arrayOfProducts;
    //private int[] arrayOfQuantity;
    private Client client;
    private int shopCapacity;
    private int productCounter;
    private int quantity;
    private String name;
    private boolean isClientAttended;
    private int finances;

    public Shop(int shopCapacity, String name) {
        this.arrayOfProducts = new TypesOfProducts[shopCapacity];
        this.shopCapacity = shopCapacity;
        this.productCounter = 0;
        this.name = name;
        this.finances = 10000;
    }

    public String getName() {
        return name;
    }

    public void attendClient(Client client) {
        this.client = client;
        isClientAttended = true;
        System.out.println("Hello sir, what would you like to buy?");
    }

    public void buyProducts(TypesOfProducts typesOfProducts) {

        if (finances <= typesOfProducts.getPrice() * 0.5) {
            System.out.println("Shop has not enough money to buy more stock");
        }
            if (productCounter < shopCapacity) {
                switch (typesOfProducts) {
                    case TV:
                        TV tv = new TV();
                        System.out.println("Shop has bought an Apple TV");
                        arrayOfProducts[productCounter] = TypesOfProducts.TV;
                        finances -= TypesOfProducts.TV.getPrice() * 0.5;
                        productCounter++;
                        break;
                    case PHONE:
                        Phone phone = new Phone();
                        System.out.println("Shop has bought an Iphone");
                        arrayOfProducts[productCounter] = TypesOfProducts.PHONE;
                        finances -= TypesOfProducts.PHONE.getPrice() * 0.5;
                        productCounter++;
                        break;
                    case COMPUTER:
                        Computer computer = new Computer();
                        System.out.println("Shop has bought an MacBook Pro");
                        arrayOfProducts[productCounter] = TypesOfProducts.COMPUTER;
                        finances -= TypesOfProducts.COMPUTER.getPrice() * 0.5;
                        productCounter++;
                        break;
                    case TABLET:
                        Tablet tablet = new Tablet();
                        System.out.println("Shop has bought an Ipad Mini");
                        arrayOfProducts[productCounter] = TypesOfProducts.TABLET;
                        finances -= TypesOfProducts.TABLET.getPrice() * 0.5;
                        productCounter++;
                        break;
                }
            } else {
                System.out.println("Your shop is already full!");
            }
        }



    public int checkQuantity(TypesOfProducts typesOfProducts) {

        quantity = 0;

        if (typesOfProducts == TypesOfProducts.TV) {

            for (int a = 0; a < arrayOfProducts.length; a++) {
                if (arrayOfProducts[a] != null && arrayOfProducts[a] == typesOfProducts) {
                    quantity++;
                }
            }
            //System.out.println("Shop has: " + quantity + " " + typesOfProducts);
            return quantity;
        }

        if (typesOfProducts == TypesOfProducts.PHONE) {

            for (int a = 0; a < arrayOfProducts.length; a++) {
                if (arrayOfProducts[a] != null && arrayOfProducts[a] == typesOfProducts) {
                    quantity++;
                }
            }
            //System.out.println("Shop has: " + quantity + " " + typesOfProducts);
            return quantity;
        }
        if (typesOfProducts == TypesOfProducts.COMPUTER) {

            for (int a = 0; a < arrayOfProducts.length; a++) {
                if (arrayOfProducts[a] != null && arrayOfProducts[a] == typesOfProducts) {
                    quantity++;
                }
            }
            //System.out.println("Shop has: " + quantity + " " + typesOfProducts);
            return quantity;
        }
        if (typesOfProducts == TypesOfProducts.TABLET) {

            for (int a = 0; a < arrayOfProducts.length; a++) {
                if (arrayOfProducts[a] != null && arrayOfProducts[a] == typesOfProducts) {
                    quantity++;
                }
            }
            //System.out.println("Shop has: " + quantity + " " + typesOfProducts);
            return quantity;
        }
        System.out.println("The stock of " + typesOfProducts + " is empty, please buy more");
        return -1;
    }

    public int getFinances() {
        System.out.println("Shop has: " + finances + " € ");
        return finances;
    }

    public int sayProductPrice(TypesOfProducts typesOfProducts) {



            if (checkQuantity(typesOfProducts) == -1) {
                return 0;
            }

            if (checkQuantity(typesOfProducts) == 0) {
                System.out.println("We don't have " + typesOfProducts + " in stock");
                return 0;
            }

            if (checkQuantity(typesOfProducts) >= 1) {

                    for (int i = 0; i < arrayOfProducts.length; i++) {
                        if (arrayOfProducts[i] != null && arrayOfProducts[i] == typesOfProducts) {
                            System.out.println("Your price for " + typesOfProducts + " is "
                                    + typesOfProducts.getPrice() + " €");
                            return  typesOfProducts.getPrice();
                        }
                        //client.setWallet(client.checkWalletBalance() - typesOfProducts.getPrice());
                       // finances = finances + typesOfProducts.getPrice();

                    }
            }
        return 0;
    }



    public void sellProductClient(TypesOfProducts typesOfProducts) {


        if (checkQuantity(typesOfProducts) == -1) {
            return;
        }

        if (checkQuantity(typesOfProducts) == 0) {
            System.out.println("We don't have " + typesOfProducts + " in stock");
            return;
        }

        if (checkQuantity(typesOfProducts) >= 1) {

            for (int i = 0; i < arrayOfProducts.length; i++) {
                if (arrayOfProducts[i] == typesOfProducts) {
                    finances += arrayOfProducts[i].getPrice();
                    arrayOfProducts[i] = null;
                    System.out.println("You bought " + typesOfProducts +
                            " for " + typesOfProducts.getPrice() + " €");
                    return;
                }
            }
        }
    }
}


