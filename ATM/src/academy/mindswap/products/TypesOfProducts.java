package academy.mindswap.products;

public enum TypesOfProducts {
    COMPUTER(1500),
    TABLET(500),
    TV(1000),
    PHONE(300);

    private int price;

    TypesOfProducts(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


