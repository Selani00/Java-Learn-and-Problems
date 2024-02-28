import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String serverAddress = "198.168.123.194";  // Replace with the actual IP address of the server
        final int portNumber = 12345;

        try (Socket socket = new Socket(serverAddress, portNumber);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            // Send a message to the server
            String messageToSend = "Hello, Server!";
            writer.println(messageToSend);
            System.out.println("Sent to server: " + messageToSend);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}