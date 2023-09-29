package task4_2;

/**
 * task 4_2
 * @author Vlad Skrynyk
 */
import java.time.LocalDate;
import java.util.*;

public class task4_2 {
    public static void main(String args[]) {
        LocalDate date = LocalDate.of(1999, 8, 13);
        date = date.plusDays(1);

        int count = 0;
        List<Integer> prev = new ArrayList<Integer>();
        for (int i = 0; i < 146097; i++) {
            String s = date.getDayOfWeek().toString();
            int d = date.getDayOfMonth();
            // System.out.println(s + " " + d);


            if (s == "FRIDAY" & d == 13) {
                // System.out.println("tyt" + s + " " + d + " " + i);
                prev.add(count);
                count = 0;
            }
            count += 1;
            date = date.plusDays(1);
        }
        Collections.sort(prev);
        Collections.reverse(prev);
        System.out.println(prev.get(0) - 1);

    }
}
