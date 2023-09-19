package task2_2;

import java.util.Scanner;

/**
 * task 2_2
 * @author Vlad Skrynyk
 */
public class task2_2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        a = a << 1;
        while (a > 0)
        {
            a = a >> 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
