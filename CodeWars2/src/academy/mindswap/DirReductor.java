package academy.mindswap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReductor {


    public static void main(String[] args) {

        String[] arr1 = {"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"};
        String[] arr = {"EAST", "EAST","EAST"};
        dirReduc(arr1);

    }


    public static String[] dirReduc(String[] arr) {

        List<String> stringList = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < stringList.size() - 1; i++) {

            if (stringList.get(i).equalsIgnoreCase("north") && stringList.get(i + 1).equalsIgnoreCase("south")) {
                stringList.remove(i);
                stringList.remove(i);
                i = -1;
                continue;

            }
            if (stringList.get(i).equalsIgnoreCase("south") && stringList.get(i + 1).equalsIgnoreCase("north")) {
                stringList.remove(i);
                stringList.remove(i);
                i = -1;
                continue;

            }
            if (stringList.get(i).equalsIgnoreCase("east") && stringList.get(i + 1).equalsIgnoreCase("west")) {
                stringList.remove(i);
                stringList.remove(i);
                i = -1;
                continue;

            }
            if (stringList.get(i).equalsIgnoreCase("west") && stringList.get(i + 1).equalsIgnoreCase("east")) {
                stringList.remove(i);
                stringList.remove(i);
                i = -1;
            }
        }

        String[] strings = stringList.toArray(new String[0]);
        for (String s: strings) {
            System.out.println(s);
        }
        return strings ;
    }

}


