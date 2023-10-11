package task2_2;

import java.util.Scanner;

/**
 * task 2_2
 * @author Vlad Skrynyk
 */
public class task2_2 {

    public static void printMatr(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = in.nextInt();
        System.out.print("Enter the number of shifts: ");
        int k = in.nextInt();

        int matr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input a["+i+"]["+j+"]=");
                matr[i][j] = in.nextInt();
            }
        }

        printMatr(matr, m, n);
        System.out.println();

        int j = 0;
        while (j < m) {

            for (int i = k; i < m; i++)
                System.out.print(matr[j][i] + " ");

            for (int i = 0; i < k; i++)
                System.out.print(matr[j][i] + " ");

            System.out.println();
            j++;
        }
    }
}
