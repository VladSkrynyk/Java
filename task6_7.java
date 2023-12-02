package task1;

import java.io.*;

public class task6_7 {
    public static void main(String[] args) {
        String filePath = "d:/study/3 course/1 sem/java/pr12/src/task2/file1.txt";

        try {
            Rectangle largestRectangle = findLargestRectangle(filePath);
            System.out.println("Прямокутник з найбільшою площею: " + largestRectangle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Rectangle findLargestRectangle(String filePath) throws IOException {
        Rectangle largestRectangle = null;
        double maxArea = Double.MIN_VALUE;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int rectangleNumber = Integer.parseInt(parts[0]);
                int x1 = Integer.parseInt(parts[1]);
                int y1 = Integer.parseInt(parts[2]);
                int x2 = Integer.parseInt(parts[3]);
                int y2 = Integer.parseInt(parts[4]);

                double area = calculateRectangleArea(x1, y1, x2, y2);
                if (area > maxArea) {
                    maxArea = area;
                    largestRectangle = new Rectangle(rectangleNumber, x1, y1, x2, y2);
                }
            }
        }

        return largestRectangle;
    }

    private static double calculateRectangleArea(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    private static class Rectangle {
        private int number;
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public Rectangle(int number, int x1, int y1, int x2, int y2) {
            this.number = number;
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public String toString() {
            return "Прямокутник #" + number + " ("
                    + "x1=" + x1 + ", y1=" + y1
                    + ", x2=" + x2 + ", y2=" + y2
                    + ")";
        }
    }
}
