package academy.mindswap;

public class Utils {

    private int minNumber;
    private int maxNumber;
    private int numberToGuess;

    public Utils(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }


    public int secretNumber() {

        int minNumber = this.minNumber;
        int maxNumber = this.maxNumber;

        numberToGuess = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);

        return numberToGuess;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }
}
