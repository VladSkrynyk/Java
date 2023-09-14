package task6;

import java.util.Scanner;

/**
 * task 6
 * @author Vlad Skrynyk
 * @file task6.html
 */
public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input 1 arg:");
        float arg1 = s.nextFloat();

        System.out.print("Input 2 arg:");
        float arg2 = s.nextFloat();

        System.out.print("Input 3 arg:");
        float arg3 = s.nextFloat();

        System.out.println(arg1 + arg2 + arg3);
    }
}
