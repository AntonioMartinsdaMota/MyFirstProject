package academy.mindswap;

public class Drink {
    private String ingredients;

    public Drink(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return "Drink with " + ingredients;
    }
}
