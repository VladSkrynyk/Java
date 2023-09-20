package task2_13;

import java.util.Scanner;

/**
 * task 2_13
 * @author Vlad Skrynyk
 */
public class task2_13 {
    public static int getFirstBitPosRight(int n) {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
    }
    public static int getFirstBitPosLeft(int n){
        int pos = 0;
        while (n > 0) {
            n = n >> 1;
            pos++;
        }
        return pos;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = s.nextInt();

        System.out.println("Rightmost set bit: " + getFirstBitPosRight(n));
        System.out.println("Leftmost set bit: " + getFirstBitPosLeft(n));
    }
}
