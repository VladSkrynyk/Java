package task5;

import java.util.Scanner;

/**
 * task 5
 * @author Vlad Skrynyk
 * @file task5.html
 */
public class task5 {
    public static void main(String[] args) {
        // 1 variant
        // System.out.println("Three arguments: " + args[0] + args[1] + args[2]);

        // 2 variant
        Scanner s = new Scanner(System.in);

        System.out.print("Input 1 arg:");
        String arg1 = s.nextLine();

        System.out.print("Input 2 arg:");
        String arg2 = s.nextLine();

        System.out.print("Input 3 arg:");
        String arg3 = s.nextLine();

        System.out.println(arg1 + arg2 + arg3);
    }
}
