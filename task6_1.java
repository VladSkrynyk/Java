package task1;

import java.io.*;

public class task6_1 {
    public static void main(String[] args) {
        String inputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file1.txt";
        String outputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file2.txt";

        try {
            double sum = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    double number = Double.parseDouble(line);
                    sum += number;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write("Сума дійсних значень: " + sum);
            }

            System.out.println("Сума дійсних значень успішно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
