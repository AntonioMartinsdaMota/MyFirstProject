package academy.mindswap;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("localhost", 8080);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader in;

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        while (!clientSocket.isClosed()) {


            System.out.println("Write something...");
            String input = bufferedReader.readLine();
            bufferedWriter.write(input);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println("Waiting response...");
            String line = in.readLine();
            System.out.println("Server Send: " + line);
            if (input.equalsIgnoreCase("exit")) {
                clientSocket.close();
                System.out.println("Client is closed!");
            }
        }
    }
}
