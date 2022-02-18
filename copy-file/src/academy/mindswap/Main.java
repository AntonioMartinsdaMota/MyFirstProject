package academy.mindswap;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        FileUtils.copy("./fileToCopy.txt","./fileToWrite.txt");


    }
}
