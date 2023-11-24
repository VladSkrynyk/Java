import commands.*;

/**
 * клас TestCommand1.java
 * тестуються всі функції класу Cmd1.java
 *
 * @author Vlad Skrynyk
 */

public class TestCommand1 {
    public static int test(String args[]) {
        try {

            int exitCode = Cmd1.mainProgramme(args);
            System.out.println("Exit Code: " + exitCode);

            if (exitCode == 0) {
                return 0;
            } else {
                return -1;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
