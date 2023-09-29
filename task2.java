package task2;

import java.util.Random;

/**
 * task 3_2
 * @author Vlad Skrynyk
 */
public class task2 {
    public static void main(String args[]) {
        Random rand = new Random();

        int nums[] = new int[25];
        nums[0] = rand.nextInt(100);

        for (int i = 1; i < 25; i++) {
            nums[i] = rand.nextInt(100);

            if (nums[i] > nums[0])
                System.out.println("Згенероване число більше за перше: " + nums[i]);
            else if (nums[i] < nums[0])
                System.out.println("Згенероване число менше за перше: " + nums[i]);
            else
                System.out.println("Згенероване число дорівнює першому");
        }
    }
}
