package academy.mindswap;

import java.util.*;

public class WordHistogram implements Iterable<String>{

    private final Map<String, Integer> wordMap = new HashMap<>();
    private final List <String> totalMap = new ArrayList<>();


    public void analyseString(String words) {


        words = words.replace(".", "");
        words = words.toLowerCase();

        String[] wordArray = words.split(" ");

        for (String string : wordArray) {

            wordMap.containsKey(string);
            wordMap.get(string);
            int value =  wordMap.containsKey(string) ? wordMap.get(string) + 1 : 1;
            this.wordMap.put(string, value);
        }
    }

    public int get(String word) {
       return wordMap.get(word);

    }

    @Override
    public Iterator<String> iterator() {
        return wordMap.keySet().iterator();
    }

}
