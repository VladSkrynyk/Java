package task4;

import java.util.Scanner;

/**
 * task 3_4
 * @author Vlad Skrynyk
 */
public class task4 {
    public static void main(String args[]) {
        int[] nums = {0, 0, 0};
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть 3 числа: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = s.nextInt();
        }

        if ((nums[0] != nums[1]) & (nums[0] != nums[2]) & (nums[1] != nums[2]))
            System.out.println("Кількість різних чисел: 3");
        else if ((nums[0] == nums[1]) & (nums[0] == nums[2]))
            System.out.println("Кількість різних чисел: 1");
        else
            System.out.println("Кількість різних чисел: 2");
    }
}
