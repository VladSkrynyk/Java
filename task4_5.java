package task4_5;

import java.util.Scanner;

/**
 * task 4_5
 * @author Vlad Skrynyk
 */
public class task4_5 {
    public static float distance(float x1, float y1, float x2, float y2) {
        return (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float[] A = new float[2];
        float[] B = new float[2];
        float[] C = new float[2];

        System.out.print("Ввеідть координати першої точки:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scn.nextFloat();
        }

        System.out.print("Ввеідть координати другої точки:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scn.nextFloat();
        }

        System.out.print("Ввеідть координати третьої точки:");
        for (int i = 0; i < C.length; i++) {
            C[i] = scn.nextFloat();
        }

        float A_B = distance(A[0], A[1], B[0], B[1]);
        float B_C = distance(B[0], B[1], C[0], C[1]);
        float C_A = distance(C[0], C[1], A[0], A[1]);

        float p = (float) (A_B + B_C + C_A) / 2;
        float s = (float) Math.sqrt(p * (p - A_B) * (p - B_C) * (p - C_A));

        System.out.println("Площа: " + s);
    }
}
