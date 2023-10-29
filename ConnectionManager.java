package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * task 1
 * @author Vlad Skrynyk
 */

class Connection {
    // Клас, який представляє з'єднання
    int filed;
}

public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 10;
    private static List<Connection> connections = new ArrayList<>();

    static {
        // Ініціалізація пулу з'єднань
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(new Connection());
        }
    }

    public static Connection getConnection() {
        // Метод для отримання з'єднання з пулу
        if (!connections.isEmpty()) {
            return connections.remove(0);
        } else {
            // Якщо закінчилися з'єднання, можна викинути виняток або повернути null
            throw new RuntimeException("No available connections.");
        }
    }

    public static void releaseConnection(Connection connection) {
        // Метод для повернення з'єднання у пул
        if (connections.size() < MAX_CONNECTIONS) {
            connections.add(connection);
        } else {
            // Якщо пул переповнено, можна викинути виняток або ігнорувати з'єднання
            System.out.println("Connection pool is full. Ignoring the connection.");
        }
    }

    public static void main(String[] args) {
        // Приклад використання пулу з'єднань
        Connection connection1 = ConnectionManager.getConnection();
        Connection connection2 = ConnectionManager.getConnection();

        // Використовуємо з'єднання...

        // Після використання повертаємо їх у пул
        ConnectionManager.releaseConnection(connection1);
        ConnectionManager.releaseConnection(connection2);
    }
}

