package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        final int PORT = 12340;
        String request;
        DatagramSocket socket;
        {
            Log.PREFIX = "C";
        } // Ustawienie loggera
        {
            Log.log("Starting UDP client");
            Log.log("Opening UDP socket");
            socket = new DatagramSocket();
        } // Otwarcie gniazda UDP
        {
            request = "Ala ma kota";
        } // Logika biznesowa generująca dane do wysłania do serwera
        {
            Log.log("Message to send: " + request);
            byte[]buf = request.getBytes();
//            InetAddress senderAddress = InetAddress.getByName("localhost"); // DNS
            InetAddress receiverAddress = InetAddress.getByName("127.0.0.1"); // DNS
            int receiverPort = PORT;
            DatagramPacket packetToSend = new DatagramPacket(buf, buf.length, receiverAddress, receiverPort);
            Log.log("Message sending");
            socket.send(packetToSend);
        } // Przygotowanie pakietu do wyslania i wysłanie
        {
            byte[]buf = new byte[1400];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            Log.log("Server UDP waiting for packets");
            socket.receive(packet);
            Log.log("Packet received from: " + packet.getAddress().getHostAddress() + ":" + packet.getPort());
            String message = new String(packet.getData(), 0, packet.getLength());
            Log.log("Message received: " + message);
        } // Przygotowanie pakietu do odbioru odpowiedzi od serwera i odbiór
        {
            Log.log("UDP server closing");
            socket.close();
            Log.log("UDP server closed");
        } // Zamkięcie gniazda UDP
    }

    public static void convert(String[] args) throws IOException {
        int x = 342344;
        byte[]b = new byte[4];
        // int -> byte[4]
        b[0] = (byte)(x & 255);
        b[1] = (byte)((x >> 8) & 255);
        b[2] = (byte)((x >> 16) & 255);
        b[3] = (byte)((x >> 24) & 255);
        // byte[4] -> int
        int y = b[3];
        y = y << 8;
        y = y | b[2];
        y = y << 8;
        y = y | b[1];
        y = y << 8;
        y = y | b[0];
        System.out.println(x + " " + y);

    }
}