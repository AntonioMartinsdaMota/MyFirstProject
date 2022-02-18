package academy.mindswap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {


    public static void main(String[] args) throws IOException {
        int portNumber = 8080;
        String hostName = "localhost";

        DatagramSocket socket = new DatagramSocket();
// CREATE A DATAGRAM PACKET AND SEND IT FROM THE SOCKET
        byte[] message = "Hello World this is another message".getBytes();
        //reads a string from console
        String input = "";
        while (!input.equals("exit")) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a message to send to the server: ");
            input = br.readLine();
            message = input.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(message, message.length, InetAddress.getByName(hostName), portNumber);
            socket.send(sendPacket);
            System.out.println("Message sent to the server: " + input);

            // RECEIVE A PACKET FROM THE SERVER
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String modifiedSentence = new String(receivePacket.getData());
            byte[] bytesModifiedSentenceBytes = modifiedSentence.getBytes();
            int i;
            for (i = 0; i < bytesModifiedSentenceBytes.length; i++) {
                if((int)bytesModifiedSentenceBytes[i] == 0){
                    break;
                }
            }
            String response = new String(bytesModifiedSentenceBytes, 0 ,i);
            System.out.println(response);
        }

    }


}
