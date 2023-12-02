package task1;

import java.io.*;

public class task6_2 {
    public static void main(String[] args) {
        String inputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file1.txt";
        String outputFilePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file2.txt";

        try {
            double product = 1.0;

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    double number = Double.parseDouble(line);
                    if (number != 0) {
                        product *= Math.abs(number);
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write("Добуток модулів ненульових елементів: " + product);
            }

            System.out.println("Добуток модулів ненульових елементів успішно записано в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
