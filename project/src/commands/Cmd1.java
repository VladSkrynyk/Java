package commands;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Cmd1 {
    public static void main(String args[]) {
        System.out.println("Start programme 1\nparameters: " + Arrays.toString(args));
    }

    public static void runWithDelay() {
        try{
            System.out.println("start");
            Thread.sleep(5000);
            System.out.println("end");
        }catch(InterruptedException e){
        }
    }

    public static void readFile() {
        try {
            File myObj = new File("d:/study/3 course/1 sem/java/project/Java/project/src/data/filename1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void writeFile() {
        try {
            FileWriter myWriter = new FileWriter("d:/study/3 course/1 sem/java/project/Java/project/src/data/filename1.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
