import commands.Cmd2;

class CustomException extends Exception {
    private static final long serialVersionUID = 9355648L;

    public CustomException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + getMessage();
    }
}

public class TestCommand2 {
    public static void test(String arg1, String arg2, String option) {
        try {
            if (option.equals("$")) {
                boolean res1 = Cmd2.runProg1(arg1);

                if (res1) {
                    boolean res2 = Cmd2.runProg2(arg2);

                    if (!res2)
                        throw new CustomException("second programme crush!!!");
                }
                else
                    throw new CustomException("first programme crush, second programme won't run!!!");

                System.out.println("Programme complete successefuly!");
            }
            else if (option.equals("*")) {
                boolean res1 = Cmd2.runProg1(arg1);

                if (res1) {
                    throw new CustomException("first programme succeded, second programme won't run!!!");
                }
                else {
                    boolean res2 = Cmd2.runProg2(arg2);

                    if (!res2)
                        throw new CustomException("second programme crush!!!");

                    System.out.println("Programme complete successefuly!");
                }
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

