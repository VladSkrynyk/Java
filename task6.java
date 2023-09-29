package task6;

import java.util.Random;

/**
 * task 3_6
 * @author Vlad Skrynyk
 */
public class task6 {
    static int experiment() {
        int countAlice = 0;
        int countBob = 0;

        int prev = -1;
        int cur = -1;

        Random rand = new Random();

        do {
            prev = cur;
            cur = rand.nextInt(2);
            countAlice++;
        } while (prev != 0 || cur != 0);

        cur = -1;
        do {
            prev = cur;
            cur = rand.nextInt(2);
            countBob++;
        } while (prev != 0 || cur != 1);

         return ((countAlice<countBob) ? 1 : 0);
    }

    public static void main(String args[]) {


        final int N = 1000;
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += experiment();
        }

        System.out.println("Result: " + (float) count/N);
    }
}
