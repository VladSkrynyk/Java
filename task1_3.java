package task1_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * task 1_3
 * @author Vlad Skrynyk
 */
public class task1_3 {

    public static void printArr(ArrayList<Integer> num) {
        System.out.print("[ ");
        for (int i = 0; i < num.size(); i++) {
            if (i == (num.size() - 1))
                System.out.print(num.get(i) + " ");
            else
                System.out.print(num.get(i) + ", ");
        }
        System.out.println("]");
    }

    public static void calcMeanStd(ArrayList<Integer> num) {
        int mean = 0;
        int std = 0;

        for(int i = 0; i < num.size(); i++) {
            mean += num.get(i);
        }
        mean = mean / num.size();
        for(int i = 0; i < num.size(); i++) {
            std += Math.pow(num.get(i) - mean, 2);
        }
        std = std / num.size();
        System.out.println("Середнє: " + mean + " Відхилення: " + std);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Введіть число: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент: ");
            int num_i = s.nextInt();

            num.add(num_i);
        }

        printArr(num);
        calcMeanStd(num);
    }
}
