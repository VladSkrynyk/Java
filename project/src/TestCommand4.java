import commands.Cmd4;

/**
 * клас TestCommand4.java
 * тестуються всі функції класу Cmd4.java
 *
 * @author Vlad Skrynyk
 */

public class TestCommand4 {
    public static void test(String args[]) {
        try {
            Cmd4.main(args);
        } catch (Exception e) {
            System.out.println("Error ocurs: " + e.getMessage());
        }
    }
}
