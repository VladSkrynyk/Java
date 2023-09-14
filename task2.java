package task2;

import java.util.Scanner;

/**
 * task 2
 * @author Vlad Skrynyk
 */
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int arg1 = s.nextInt();

        System.out.print("Введіть друге число: ");
        int arg2 = s.nextInt();

        int arg1_res = (int) Math.log10(Math.abs(arg1)) + 1;
        int arg2_res = (int) Math.log10(Math.abs(arg2)) + 1;

        System.out.println("Кількість розрядів першого числа: " + arg1_res);
        System.out.println("Кількість розрядів другого числа: " + arg2_res);

        float r1 = (float) 1 / arg1;
        float r2 = (float) 1 / arg2;
        System.out.println("Середнє гармонічне двох чисел: " + String.format("%.2f", 2 / (r1 + r2)));
    }
}
