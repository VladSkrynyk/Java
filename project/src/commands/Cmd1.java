package commands;

import java.util.Arrays;

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
}
