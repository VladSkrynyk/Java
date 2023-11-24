package commands;

import java.util.Arrays;
/**
 * клас Cmd2.java
 * запускає дві команди з відповідними умовами.
 *
 * Допоміжні класи: FirstProgram, SecondProgram
 *
 * @author Vlad Skrynyk
 */

class FirstProgram {
    private int initialState;

    public FirstProgram(int initialState) {
        this.initialState = initialState;
    }

    public int getInitialState() {
        return initialState;
    }
    @Override
    public String toString() {
        return "FirstProgram{initialState=" + initialState + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FirstProgram that = (FirstProgram) obj;
        return initialState == that.initialState;
    }

    public boolean test() {
        return initialState == 1;
    }
}
class SecondProgram {
    private int initialState;

    public SecondProgram(int initialState) {
        this.initialState = initialState;
    }

    public int getInitialState() {
        return initialState;
    }
    @Override
    public String toString() {
        return "SecondProgram{initialState=" + initialState + '}';
    }

    public boolean test() {
        return initialState == 1;
    }
}

public class Cmd2 {

    public static boolean runProg1(String arg1) {
        FirstProgram pr1 = new FirstProgram(Integer.parseInt(arg1));

        return pr1.test();
    }

    public static boolean runProg2(String arg2) {
        FirstProgram pr2 = new FirstProgram(Integer.parseInt(arg2));

        return pr2.test();
    }
    public static int mainProgramme(String arg1, String arg2) {

        FirstProgram pr1 = new FirstProgram(Integer.parseInt(arg1));
        SecondProgram pr2 = new SecondProgram(Integer.parseInt(arg2));

        if (pr1.getInitialState() == pr2.getInitialState())
            return 0;
        else
            return -1;
    }

    public static void main(String args[]) {
        System.out.println("Start programme 2\nparameters: " + Arrays.toString(args));
    }
}
