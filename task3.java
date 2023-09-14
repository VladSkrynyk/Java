package task3;

import java.util.Scanner;

/**
 * task 3
 * @author Vlad Skrynyk
 */
public class task3 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.print("Введіть 2 дійсних числа через пробіл: ");

        float[] val = new float[2];

        for (int i = 0; i < val.length; i++) {
            val[i] = scn.nextFloat();
        }

        System.out.printf("Результат: %e", Math.sqrt(val[0] * val[1]));
        System.out.println();
        System.out.printf("Результат: %f", Math.sqrt(val[0] * val[1]));
    }
}
