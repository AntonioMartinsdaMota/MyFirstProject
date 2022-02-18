package academy.mindswap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        BufferedReader in;

        while (true) {

            Socket clientSocket = serverSocket.accept();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            while (!clientSocket.isClosed()) {
                System.out.println("Waiting response...");
                String line = in.readLine();
                System.out.println("Client Send: " + line);


                System.out.println("Write something...");
                String newLine = bufferedReader.readLine();
                bufferedWriter.write(newLine);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                    if (newLine.equalsIgnoreCase("exit")) {
                        clientSocket.close();
                        System.out.println("Server is closed!");
                        break;
                    }
                if (line == null) {
                    clientSocket.close();
                    break;
                }
            }
        }
    }
}
