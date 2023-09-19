package task2_3;
/**
 * task 2_3
 * @author Vlad Skrynyk
 */
public class task2_3 {
    public static void main(String args[]) {
        char c = 'A';
        String binaryString = Integer.toBinaryString(c);

        while (binaryString.length() < 8) {
            binaryString = "0" + binaryString;
        }

        System.out.println(binaryString);
    }
}
