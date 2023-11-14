import commands.*;

import java.io.IOException;

public class TestCommand1 {
    public static int test(String args[]) {
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
            return -1;
        }
    }
}
