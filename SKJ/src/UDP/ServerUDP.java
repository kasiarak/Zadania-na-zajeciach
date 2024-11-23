package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class ServerUDP {
    public static void main(String[] args) throws IOException {
        final int PORT = 12340;
        DatagramSocket socket;
        DatagramPacket packet;
        String message;
        String response;
        {
            Log.PREFIX = "S";
        } // Przygotowanie loggera
        {
            Log.log("Starting UDP server");
            Log.log("Opening UDP socket");
            socket = new DatagramSocket(PORT);
            //   socket.setSoTimeout(1000);
        } // Otwarcie socketa UDP na serwerze
        {
            byte[] buf = new byte[1400];
            packet = new DatagramPacket(buf, buf.length);
            Log.log("Server UDP waiting for packets");
            socket.receive(packet);
        } // Odbior pakietu od klienta
        {
            Log.log("Packet received from: " + packet.getAddress().getHostAddress() + ":" + packet.getPort());
            message = new String(packet.getData(), 0, packet.getLength());
            Log.log("Message received: " + message);
        } // przetworzenie odebranego pakietu
        {
            response = message.toUpperCase();
        } // Logika biznesowa powiedzmy
        {
            Log.log("Message to send: " + response);
            byte[] buf = response.getBytes();
            InetAddress receiverAddress = packet.getAddress();
            int receiverPort = packet.getPort();
            DatagramPacket packetToSend = new DatagramPacket(buf, buf.length, receiverAddress, receiverPort);
            Log.log("Message sending");
            socket.send(packetToSend);
        } // Wysłanie pakietu z odpowiedzią do klienta
        {
            Log.log("UDP server closing");
            socket.close();
            Log.log("UDP server closed");
        } // Zamknięcie gniazda UDP
    }
}
