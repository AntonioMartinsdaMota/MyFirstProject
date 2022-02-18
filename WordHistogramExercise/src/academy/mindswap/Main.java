package academy.mindswap;

public class Main {

    private static final String STRING_TO_ANALISE = "You can always trust the untrustworthy because you can always trust that they will be untrustworthy. It's the trustworthy you cannot trust.";

    public static void main(String[] args) {



        WordHistogram wordHistogram = new WordHistogram();
        wordHistogram.analyseString(STRING_TO_ANALISE);
        System.out.println();



        for(String word : wordHistogram){
           System.out.println(word + ":" + wordHistogram.get(word));
        }

    }
}
