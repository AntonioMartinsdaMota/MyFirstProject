package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Restaurant - MindSwap");
        System.out.println(" ");
        System.out.println("Menu 1: ");
        System.out.println(" ");


        Food[][] menu1 = {{new Food("Cheeseburger", 1, new String[]{"Bread", "Meat"})},
                {new Food("Fries", 10,new String[]{"Potatoes"})},
                {new Food("Coke", 1,new String[]{"Water","Sugar"})}};

        for (int i = 0; i < menu1.length; i++) {
            for (int j = 0; j < menu1[i].length; j++) {
                System.out.print("Option " + (i+1) + ": " + menu1[i][j].getQuantity() + "x " + menu1[i][j].getName()
                        + "(" );

                for (int k = 0; k < menu1[i][j].getRecipe().length ; k++) {
                    if(menu1[i][j].getRecipe().length-1 == k ){
                        System.out.print(menu1[i][j].getRecipe()[k]);
                        continue;
                    }

                    System.out.print(menu1[i][j].getRecipe()[k] + ", ");
                }
                System.out.println(")");
            }

        }
       /*  System.out.println(" ");
        System.out.println("Menu 2: ");
        System.out.println(" ");

       Food[][] menu2 = {{new Food("Chickenburger", 1)}, {new Food("fries", 10)}, {new Food("Fanta", 1)}};

        for (int i = 0; i < menu2.length; i++) {
            for (int j = 0; j < menu2[i].length; j++) {
                System.out.println("Option " + (i+1) + ": " + menu2[i][j].getQuantity() + "x " + menu2[i][j].getName());
            }

        }*/



    }
}
