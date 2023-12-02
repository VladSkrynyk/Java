package task15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task15 {
    public static void main(String[] args) {
        String filePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file.txt";

        try {
            int redCubesVolume = 0;
            int yellowCubesVolume = 0;
            int greenCubesVolume = 0;
            int blueCubesVolume = 0;
            int woodenCubesCount = 0;
            int metalCubesCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(","); // Припускається, що дані розділені комою
                    int size = Integer.parseInt(parts[0].trim());
                    String color = parts[1].trim();
                    String material = parts[2].trim();

                    int volume = size * size * size;

                    switch (color) {
                        case "червоний":
                            redCubesVolume += volume;
                            break;
                        case "жовтий":
                            yellowCubesVolume += volume;
                            break;
                        case "зелений":
                            greenCubesVolume += volume;
                            break;
                        case "синій":
                            blueCubesVolume += volume;
                            break;
                    }

                    if (material.equals("дерев'яний") && size == 3) {
                        woodenCubesCount++;
                    }

                    if (material.equals("металевий") && size > 5) {
                        metalCubesCount++;
                    }
                }

            }

            System.out.println("Кількість червоних кубиків та їх сумарний об'єм: " + redCubesVolume);
            System.out.println("Кількість жовтих кубиків та їх сумарний об'єм: " + yellowCubesVolume);
            System.out.println("Кількість зелених кубиків та їх сумарний об'єм: " + greenCubesVolume);
            System.out.println("Кількість синіх кубиків та їх сумарний об'єм: " + blueCubesVolume);
            System.out.println("Кількість дерев'яних кубиків з ребром 3 см: " + woodenCubesCount);
            System.out.println("Кількість металевих кубиків з ребром більшим за 5 см: " + metalCubesCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
