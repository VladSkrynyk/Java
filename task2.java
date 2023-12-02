package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        String filePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file.txt";

        try {
            int emptyLinesCount = countEmptyLines(filePath);
            System.out.println("Кількість порожніх рядків: " + emptyLinesCount);

            int maxLineLength = getMaxLineLength(filePath);
            System.out.println("Максимальна довжина рядків: " + maxLineLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countEmptyLines(String filePath) throws IOException {
        int emptyLinesCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    emptyLinesCount++;
                }
            }
        }

        return emptyLinesCount;
    }

    private static int getMaxLineLength(String filePath) throws IOException {
        int maxLineLength = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int lineLength = line.length();
                if (lineLength > maxLineLength) {
                    maxLineLength = lineLength;
                }
            }
        }

        return maxLineLength;
    }
}
