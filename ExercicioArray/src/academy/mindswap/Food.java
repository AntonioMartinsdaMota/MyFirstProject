package academy.mindswap;

public class Food {

    private String name;
    private int quantity;
    private String[] recipe;


    public Food(String name, int quantity, String[] recipe) {
        this.name = name;
        this.quantity = quantity;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String[] getRecipe() {
        return recipe;
    }
}
