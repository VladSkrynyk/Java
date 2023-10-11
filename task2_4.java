package task2_4;

import java.util.Scanner;

/**
 * task 2_4
 * @author Vlad Skrynyk
 */
public class task2_4 {
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

        int matr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input a["+i+"]["+j+"]=");
                matr[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if (matr[i][j] > 0)
                    s += matr[i][j];
                else
                    s = 0;
            }
            System.out.println("In " + (i + 1) + " row, sum is: " + s);
        }



        printMatr(matr, m, n);
    }
}
