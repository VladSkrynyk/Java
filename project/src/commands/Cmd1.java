package commands;

import java.io.*;
import java.util.Arrays;

/**
 * клас Cmd1.java
 * запускає системну програму з відповідними аргументами.
 *
 * @author Vlad Skrynyk
 */

public class Cmd1 {
    public static int mainProgramme(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(args);

            Process process = processBuilder.start();

            java.io.InputStream is = process.getInputStream();
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
            String output = s.hasNext() ? s.next() : "";

            System.out.println("Command output:");
            System.out.println(output);

            process.waitFor();

            int exitCode = process.exitValue();
            System.out.println("Exit Code: " + exitCode);

            if (exitCode == 0) {
                return 0;
            } else {
                return -1;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static void main(String args[]) {
        System.out.println("Start programme 1\nparameters: " + Arrays.toString(args));
    }

    public static void runWithDelay() {
        try{

            Thread.sleep(5000);

        }catch(InterruptedException e){
        }
    }

}
