package task3_20;

import java.util.Scanner;

/**
 * task 4_5
 * @author Vlad Skrynyk
 */
public class task3_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] A = new int[2];

        System.out.print("Введіть два катети:");
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextInt();
        }

        System.out.println("Результат:" + (float) Math.sqrt(Math.pow(A[0], 2) + Math.pow(A[1], 2)));
    }
}
