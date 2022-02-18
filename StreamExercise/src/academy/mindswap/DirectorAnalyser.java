package academy.mindswap;

import java.io.*;

public class DirectorAnalyser {

    private BufferedReader consoleReader;
    private BufferedWriter writer;


    public void createStreams() throws IOException {

        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new FileWriter("./resources/listFolder.txt"));


    }

    public String getUserInput() {

        try {
            return consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private File askDirectory() throws IOException {
        System.out.println("Whats the directory"); // escreve te a pergunta no terminal
        String folder = getUserInput(); //ler o diretorio que esta na consola - folder é uma String igual ao
        // que escrevo na consola. ex: resources.
        File dir = new File(folder); // file é um diretorio do java. new File(folder) é a String da linha 20 (String folder)
        if (dir.isDirectory()) return dir; //
        return askDirectory();
    }



    public void writeDownFiles() throws IOException {
        File directory = askDirectory();

        String[] filesOnDirectory = directory.list();

        for (String file : filesOnDirectory) { // para cada String File : no filesOnDirectory faz algo:

//            \n new line
            writer.write(file + "\n");
            writer.flush();
            System.out.println(file);
        }
    }

    public File askFile(String path) throws IOException {

        System.out.println("What file?");

        String fileName = getUserInput();

        File file = new File(path+"/"+fileName);

        return file;
        }


        private String askFileName() throws IOException{

            System.out.println("Write the name of the file you want to create");

           String fileName = getUserInput();

            return fileName;
        }



    public void checkFilePresence() throws IOException {

        File directory = askDirectory();

        String path = directory.getPath();

        File file = askFile(path);

        String[] filesOnDirectory = directory.list();

        String fileName = file.getName();

        for (String fileToFind : filesOnDirectory) {
                if (fileToFind.equals(fileName)){
                    System.out.println("This file is on the directory");
                    return;
                }

        }
        System.out.println("file not found");
        checkFilePresence();

    }


    public void createFile() throws IOException{

        String dirPath = askDirectory().getPath();

        String fileName = askFileName();

        File newFile = new File(dirPath+"/"+fileName);


        newFile.createNewFile();
        System.out.println("File created with name: " + fileName);


       // new BufferedWriter(new FileWriter(newFile));

    }

    public void closeStreams() throws IOException{
        writer.close();
        consoleReader.close();
        System.out.println("It's all closed");
    }
}





  /*  try {
           // consoleReader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] buffer = new char[10];

        int readBytes;

        while ((readBytes = consoleReader.read(buffer)) != -1) {
            System.out.println("\nread bytes:`" + readBytes);
          //  System.out.println(new String(buffer));
            for (int i = 0; i < readBytes; i++) {
                System.out.print(buffer[i]);
            }

        }*/


