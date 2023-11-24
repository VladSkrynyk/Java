package commands;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * клас Cmd4.java
 * запускає програму в мережевому варіанті:
 * тобто програма відкриває порт і працювати з нею можна за допомогою
 * звичайного telnet з віддаленої машини.
 *
 * @author Vlad Skrynyk
 */

public class Cmd4 {
    private static final int PORT = 12345;
    private static List<ConnectedClient> connectedClients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Сервер запущено на порту " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String clientId = UUID.randomUUID().toString();

                ConnectedClient connectedClient = new ConnectedClient(clientId, out);
                connectedClients.add(connectedClient);

                ClientHandler clientHandler = new ClientHandler(clientSocket, connectedClient);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ConnectedClient {
        private String clientId;
        private PrintWriter out;

        public ConnectedClient(String clientId, PrintWriter out) {
            this.clientId = clientId;
            this.out = out;
        }

        public String getClientId() {
            return clientId;
        }

        public PrintWriter getOut() {
            return out;
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket clientSocket;
        private BufferedReader in;
        private ConnectedClient connectedClient;

        public ClientHandler(Socket socket, ConnectedClient connectedClient) {
            this.clientSocket = socket;
            this.connectedClient = connectedClient;
            try {
                this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String clientMessage;
                while ((clientMessage = in.readLine()) != null) {
                    System.out.println("Повідомлення від клієнта " + clientMessage);

                    if (clientMessage.equalsIgnoreCase("who I write")) {
                        connectedClient.getOut().println("Server: Your ID is " + connectedClient.getClientId());
                    } else {
                        for (ConnectedClient client : connectedClients) {
                            client.getOut().println(connectedClient.getClientId() + ": " + clientMessage);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

