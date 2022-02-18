package academy.mindswap;

public class PasswordGenerator {

    public static void main(String[] args) {
        generatePassword("Joana Carneiro"); // should print "G@br!el"
        generatePassword("Brian Antonio"); // should print "@d@ms"
    }

    public static void generatePassword(String musicianName) {
        // write your code here}

    int findSpace = musicianName.indexOf(" ");
     String lastName = musicianName.substring(findSpace+1)
             .replaceAll("[aA]","@")
             .replaceAll("[iI]", "!");
        System.out.println(lastName);

            
        }
        
    }
}

