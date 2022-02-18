package academy.mindswap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Server {

    public static void main(String[] args) throws IOException {
	// write your code here
        // OPEN AN UDP SOCKET
        int portNumber = 8080;
        String hostName = "localhost";
        List<String> inspirationalString = Files.readAllLines(Path.of("src/academy/mindswap/inspirational.txt"));

        DatagramSocket socket = new DatagramSocket(portNumber);

// CREATE A DATAGRAM PACKET AND SEND IT FROM THE SOCKET

       // byte[] message = "Hello World".getBytes();
       // DatagramPacket sendPacket = new DatagramPacket(message, message.length, InetAddress.getByName(hostName), portNumber);
      //  socket.send(sendPacket);

// CREATE A DATAGRAM PACKET AND RECEIVE DATA FROM THE THE SOCKET
        byte[] recvBuffer = new byte[1024];


        while (socket.isBound()) {
            DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);


            System.out.println("Waiting for packet...");
            socket.receive(receivedPacket); // blocking method!

            String receivedString = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println("Received: " + receivedString);

            //Send a message to our client
            InetAddress address = receivedPacket.getAddress();
            int port = receivedPacket.getPort();

            if (receivedString.equals("Hit me")){
                int randomGen = (int) (Math.random() * 12);
                String response = "This is the inspirational String: " + inspirationalString.get(randomGen);
                byte[] responseBytes = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, address, port);
                socket.send(responsePacket);
                continue;
            }
            String response = "Hello i'm replying with " + receivedString;
            byte[] responseBytes = response.getBytes();
            DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, address, port);
            socket.send(responsePacket);

        }

// CLOSE THE SOCKET
        socket.close();

    }



}
