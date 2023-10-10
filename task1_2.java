package task1_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * task 1_2
 * @author Vlad Skrynyk
 */
public class task1_2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Введіть число: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int min = n;
        int max = n;

        while (n != 0) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }

            num.add(n);

            System.out.print("Введіть число: ");
            n = s.nextInt();
        }

        System.out.println("Мінімальне: " + min + ", Максимальне: " + max);
    }
}
