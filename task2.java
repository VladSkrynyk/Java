package task2;

import java.util.Scanner;

/**
 * task 1_2
 * @author Vlad Skrynyk
 */
public class task2 {
    public static void main(String args[]) {
        String s1, s2;
        Scanner s = new Scanner(System.in);

        System.out.print("s1=");
        s1 = s.next();

        System.out.print("s2=");
        s2 = s.next();

        if (s1.equals(s2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
