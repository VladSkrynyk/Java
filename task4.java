package task4;

import java.util.Scanner;

public class task4 {
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine()
                .replace("an", "")
                .replace("a", "");
        System.out.println(str);
    }
}