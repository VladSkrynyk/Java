package task4_22;

import java.util.Arrays;

/**
 * task 4_22
 * @author Vlad Skrynyk
 */
public class task4_22 {
    public static void main(String args[]) {

        int[] seq = {1, 2, -13, 44, -5, 7, -6, 99, -1, 0};

        int maxNegative = seq[2];
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > maxNegative & seq[i] < 0) {
                maxNegative = seq[i];
            }
        }

        System.out.println("Величина найбільшого серед відємних членів цієї послідовності: " + maxNegative);
    }
}
