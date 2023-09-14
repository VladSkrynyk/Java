package task1;

import java.util.Scanner;
/**
 * task 1
 * @author Vlad Skrynyk
 */
public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть прізвище: ");
        String surname = s.nextLine();

        System.out.println("Привіт, " + surname);
    }
}
