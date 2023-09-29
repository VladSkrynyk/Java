package task4_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * task 4_1
 * @author Vlad Skrynyk
 */
public class task4_1 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);

        float c = (float) a / b;
        String [] s = Float.toString(c).split("\\.");
        System.out.println("origin => " + s[0] + "." + s[1]);
        // System.out.println(s[0] + " " + s[1]);
        String input = s[1];

        String first_ch = Character.toString(input.charAt(0));
        List<String> list = new ArrayList<String>();
        list.add(first_ch);

        for (int i = 1; i < input.length(); i++) {
            if (!Character.toString(input.charAt(i)).equals(first_ch)) {
                // System.out.println("tyt" + Character.toString(input.charAt(i)) + " " + first_ch);
                list.add(Character.toString(input.charAt(i)));
            }
            else {
                break;
            }
        }

        String result = ".(";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        result += ")";

        System.out.println("result => " + s[0] + result);
    }


}
