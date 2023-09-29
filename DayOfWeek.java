package task3_7;

import java.util.Scanner;

/**
 * task 3_7
 * @author Vlad Skrynyk
 */
public class DayOfWeek {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть номер тижня: ");
        int DayOfWeekNumber = s.nextInt();

        switch (DayOfWeekNumber) {
            case 0:
                System.out.println("понеділок");
                break;
            case 1:
                System.out.println("вівторок");
                break;
            case 2:
                System.out.println("середа");
                break;
            case 3:
                System.out.println("четвер");
                break;
            case 4:
                System.out.println("пятниця");
                break;
            case 5:
                System.out.println("субота");
                break;
            case 6:
                System.out.println("неділя");
                break;
        }
    }
}
