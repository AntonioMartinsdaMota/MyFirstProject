package academy.mindswap;

public class Main {

    public static void main(String[] args) {

    CoffeeShop coffeeShop = new CoffeeShop();
    Drink myDrink = coffeeShop.serveDrink("Latte");
    Drink newDrink = new Drink("milk, water");

        System.out.println(myDrink.toString());

    }
}
