package task1;

import java.io.*;
public class task6_3 {
    public static void main(String[] args) {
        String inputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file1.txt";
        String outputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file2.txt";

        try {
            long product = 1;

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line);
                    if (number % 2 == 0) {
                        product *= number;
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write("Добуток парних елементів: " + product);
            }

            System.out.println("Добуток парних елементів успішно записано в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
