package academy.mindswap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //scramble('rkqodlw', 'world') //==> True
        // scramble('cedewaraaossoqqyt', 'codewars') //==> True
        // scramble('katas', 'steak')// ==> False

        System.out.println(scramble("katas", "steak"));

    }

    public static boolean scramble(String str1, String str2) {

        int count = 0;

        List<String> str1List = new ArrayList<>(List.of(str1.split("")));
        List<String> str2List = new ArrayList<>(List.of(str1.split("")));

        for (String s : str2List) {
            if (str1List.contains(s)) {
                str1List.remove(s);
                System.out.println(s);
                count++;
            }
        }

        if (str2List.size() == count) {
            System.out.println(count);
            return true;
        }
        return false;
    }
}