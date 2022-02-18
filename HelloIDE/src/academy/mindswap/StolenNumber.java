package academy.mindswap;

public class StolenNumber {

    public static void main(String args[]) {
        findStolenNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 10); // should print 4
        findStolenNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}, 10); // should print 9
        findStolenNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10); // should print "no number was stolen"

    }

    public static void findStolenNumber(int[] numbers, int maxNumber) {
        // write your code here

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if (numbers[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
        if (numbers.length < maxNumber) {
            System.out.println(numbers.length + 1);
        } else {
            System.out.println("no number was stolen");
        }
    }
}
