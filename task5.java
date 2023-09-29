package task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * task 3_5
 * @author Vlad Skrynyk
 */
public class task5 {
    public static int calculateMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[2];
    }
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.print("Введіть 5 цілих чисел: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = s.nextInt();
        }

        if (numbers.length != 5) {
            System.out.println("Введіть рівно п'ять цілих чисел у командному рядку.");
            return;
        }

        int median = calculateMedian(numbers);
        System.out.println("Медіана: " + median);
    }

}
