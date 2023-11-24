import commands.Cmd3;

/**
 * клас TestCommand3.java
 * тестуються всі функції класу Cmd3.java
 *
 * @author Vlad Skrynyk
 */

public class TestCommand3 {
    public static int test(String args[]) {
        try {
            for (String file : args) {
                Cmd3.mainProgramme(file);
            }

            return 0;
        } catch (Exception e) {
            return -1;
        }

    }
    public static void main(String args[]) {

    }
}




