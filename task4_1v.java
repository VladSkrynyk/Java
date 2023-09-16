package task4_1v;

import java.util.Scanner;

/**
 * task 4_1v
 * @author Vlad Skrynyk
 */
public class task4_1v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть значення X:");
        float x = s.nextFloat();

        float x2 = x*x;
        float x3 = x2*x;
        float x4 = x2*x2;
        float x5 = x3*x2;

        System.out.println("Результат:" + (1.0 + 5.0*x + 10.0*x2 + 10.0*x3 + 5.0*x4 + x5));
    }
}
