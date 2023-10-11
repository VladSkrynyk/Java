package task1_12;

import java.util.Scanner;

/**
 * task 1_12
 * @author Vlad Skrynyk
 */
public class task1_12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input sentence: ");
        String str = s.nextLine();

        String words[] = str.split("\\s+");

        System.out.println("Number of characters: " + str.length());
        System.out.println("Number of words: " + words.length);
    }
}
