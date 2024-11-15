package klient_serwer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

    private static int port = 2130;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scn =  new Scanner(System.in);

        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        String userInput = "";
        String serverResponse = "";
        boolean running = true;
        while (running) {

            socket = new Socket(host.getHostName(), port);
            oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("Sending request to server");
            userInput = scn.next();
            oos.writeObject(userInput);

            ois = new ObjectInputStream(socket.getInputStream());
            serverResponse = ois.readObject().toString();
            System.out.println("Server responded: '" + serverResponse + "'");

            ois.close();
            oos.close();


            if (userInput.equalsIgnoreCase("exit")) {
                running = false;
            }

        }

        System.out.println("Client disconnected");

    }
}

