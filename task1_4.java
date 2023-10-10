package task1_4;

import java.util.*;

/**
 * task 1_4
 * @author Vlad Skrynyk
 */
public class task1_4 {

    public static int containKey(Map<Integer, Integer> dict, int num) {
        if (dict.get(num) != null)
            return 1;
        else
            return 0;
    }
    public static void main(String args[]) {
        Map<Integer, Integer> dict= new Hashtable<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть кількість чисел: ");
        int n = s.nextInt();
        int prev = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент: ");
            int num = s.nextInt();

            if (containKey(dict, num) == 1) {
                if (num == prev)
                    dict.put(num, dict.get(num) + 1);
            }
            else
                dict.put(num, 1);

            prev = num;
        }

        int max_v = 0;
        int max_k = 0;

        for (int el : dict.keySet()) {
            if (dict.get(el) > max_v) {
                max_v = dict.get(el);
                max_k = el;
            }
        }

        System.out.println("Результат: " + max_v + " підряд чисел: " + max_k);
    }
}
