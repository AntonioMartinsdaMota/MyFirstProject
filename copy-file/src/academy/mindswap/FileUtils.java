package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    public static void copy(String input, String output) {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;


        byte[] buffer = new byte[1024];

        try {
            fileInput = new FileInputStream(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileOutput = new FileOutputStream(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while (fileInput.read(buffer) != -1) {

                for (byte b : buffer) {
                    if (b != 0) {
                        System.out.print((char) b);
                        try {
                            fileOutput.write(b);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                buffer = new byte[1024];
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInput.close();
                fileOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}