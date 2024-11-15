package klient_serwer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    private static int port = 2130;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(port);

        String message = "";
        boolean running = true;
        while (running) {

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            message = ois.readObject().toString();
            System.out.println("received: '" + message + "' message from client");

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Hi client, I received your message: '" + message + "'");

            ois.close();
            oos.close();
            socket.close();

            if(message.equalsIgnoreCase("exit")) {
                running = false;
            }
        }

        System.out.println("Server closed");
        serverSocket.close();

    }
}
