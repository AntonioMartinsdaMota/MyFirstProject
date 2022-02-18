package academy.mindswap;

public class CoffeeShop {

    public Drink serveDrink(DrinkType drink) {

        if (DrinkType.MACCHIATO_DT.equals(drink)) {
            return new Drink("coffee, milk");
        }
        if (DrinkType.MOCHA_DT.equals(drink)) {
            return new Drink("coffee, chocolate syrup, milk");
        }

            /*case DrinkType.MOCHA:
                return new Drink("coffee, chocolate syrup, milk");
            case DrinkType.FRAPUCCINO:
                return new Drink("coffee, milk, ice, caramel syrup");
            default:
                return new Drink("water");*/
        }
    }
}



