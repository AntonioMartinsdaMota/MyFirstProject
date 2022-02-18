package academy.mindswap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            DirectorAnalyser directorAnalyser = new DirectorAnalyser();
            directorAnalyser.createStreams();
            //directorAnalyser.writeDownFiles();
            //directorAnalyser.checkFilePresence();
           directorAnalyser.createFile();
           // directorAnalyser.askFile();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
