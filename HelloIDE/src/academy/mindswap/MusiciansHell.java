package academy.mindswap;

public class MusiciansHell {

    public static void main(String[] args) {
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};
        String musician = pickMusician(musicians); // should return the musician's name, or "No one will stay to help."
        System.out.println(musician);
    }


    public static String pickMusician(String[] musicians) {
        // write your code here

        int min = 10;
        int max = 15;

        for (int i = 0; i < musicians.length; i++) {
            int numberOfLetters = musicians[i].length() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            if (numberOfLetters > randomNumber) {
                return (musicians[i]);
            }

        } return ("No one will stay to help.");
    }
}

//Enunciado:
//The party is coming to an end, and the last musicians are leaving the venue when the staff calls them to help clean up the place.
//No one wants to do it, so a plan takes form: they will all line up, and a staff member will think of a random number between 10 and 15 to give each artist.
// If the musician's name has more letters than the picked number, that musician gets chosen to help. The others are free to go.