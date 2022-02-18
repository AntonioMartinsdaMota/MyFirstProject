package academy.mindswap;

public class DishTester {

    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington"); // should print true
        testDish("Mick Jagger", "mushroom soup"); // should print false
    }

    public static void testDish(String musicianName, String dish) {
        // write your code here

        char firstLetterMusician = musicianName.charAt(0);
        char lastLetterMusician = musicianName.charAt(musicianName.length() - 1);
        char firstLetterDish = dish.charAt(0);
        char lastLetterDish = dish.charAt(dish.length() - 1);

        if (Character.toLowerCase(firstLetterMusician) == Character.toLowerCase(firstLetterDish)
                && Character.toLowerCase(lastLetterMusician) == Character.toLowerCase(lastLetterDish)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}


