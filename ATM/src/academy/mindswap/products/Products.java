package academy.mindswap.products;

public class Products {
    private int price;
    private String productName;
    private int quantity;
    private TypesOfProducts typesOfProduct;

    public Products(int price, String productName, TypesOfProducts typesOfProduct) {
        this.price = price;
        this.productName = productName;
        this.quantity = 0;
    }

    public TypesOfProducts getTypesOfProduct() {
        return typesOfProduct;
    }

    public int getPrice() {
        return price;
    }
}

