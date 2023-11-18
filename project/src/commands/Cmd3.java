package commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class MultithreadingDemo extends Thread {
    String file = "";
    MultithreadingDemo (String file) {
        this.file = file;
    }
    public void run() {
        try {
            writeFile("start");
            System.out.println("start" + Thread.currentThread().getId());

            Thread.sleep(30000);

            System.out.println("end" + Thread.currentThread().getId());
            writeFile("end");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public String readFile(String file) {
        try {
            File myObj = new File("d:/study/3 course/1 sem/java/project/Java/project/src/data/" + file);
            Scanner myReader = new Scanner(myObj);
            String data = "";
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                // System.out.println(data);
            }
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }

    }

    public void writeFile(String message) {
        try {
            FileWriter myWriter = new FileWriter("d:/study/3 course/1 sem/java/project/Java/project/src/data/" + this.file);
            myWriter.write(message);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }


}
public class Cmd3 {
    public static int mainProgramme(String file) {
        try {
            MultithreadingDemo object = new MultithreadingDemo(file);
            object.start();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static void jobs(String files[]) {
        for (String file: files) {
            MultithreadingDemo object = new MultithreadingDemo(file);
            String info = object.readFile(file);
            if (info.equals("start")) {
                System.out.println("File " + file + " is running...");
            }

        }

    }

    public static void main(String args[]) {
        System.out.println("Start programme 3\nparameters: " + Arrays.toString(args));
    }
}
