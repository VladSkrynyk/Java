import commands.Cmd4;

public class TestCommand4 {
    public static void test(String args[]) {
        try {
            Cmd4.main(args);
        } catch (Exception e) {
            System.out.println("Error ocurs: " + e.getMessage());
        }
    }
}
