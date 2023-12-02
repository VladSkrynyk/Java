package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a coefficient: ");
        float a = in.nextFloat();
        System.out.print("Input b coefficient: ");
        float b = in.nextFloat();
        System.out.print("Input c coefficient: ");
        float c = in.nextFloat();

        try {
            if (a == 0)
                throw new ArithmeticException("a coefficient can't be zero!!!");

            double D = Math.pow(b, 2) - 4 * a * c;

            if (D < 0)
                throw new SqrnExeption("D is negative, no real roots!!!");

            double D_sqrt = Math.sqrt(D);
            double x1 = (-b + D_sqrt) / 2 * a;
            double x2 = (-b - D_sqrt) / 2 * a;

            System.out.println("Roots: x1=" + x1 + " x2=" + x2);

        }catch (SqrnExeption e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
