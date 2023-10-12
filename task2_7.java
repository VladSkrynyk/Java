package task2_7;

import java.util.Scanner;
/**
 * task 2_7
 * @author Vlad Skrynyk
 */
public class task2_7 {

    static void rotate90(int a[][], int m)
    {
        for (int i = 0; i < m / 2; i++)
        {
            for (int j = i; j < m - i - 1; j++)
            {

                int temp = a[i][j];
                a[i][j] = a[m - 1 - j][i];
                a[m - 1 - j][i] = a[m - 1 - i][m - 1 - j];
                a[m - 1 - i][m - 1 - j] = a[j][m - 1 - i];
                a[j][m - 1 - i] = temp;
            }
        }
    }
    static void rotate180(int a[][], int m) {
        rotate90(a, m);
        rotate90(a, m);
    }
    static void rotate270(int a[][], int m) {
        rotate180(a, m);
        rotate90(a, m);
    }
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
        printMatr(matr, m, n);
        rotate90(matr, m);
        rotate180(matr, m);
        rotate270(matr, m);
        printMatr(matr, m, n);


    }
}
