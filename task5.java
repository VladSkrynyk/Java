package task5;

import java.util.Scanner;

public class task5 {
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine()
                .replace("small", "very small")
                .replace("large", "very large");
        System.out.println(str);
    }
}

