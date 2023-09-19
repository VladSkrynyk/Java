package task2_1;
/**
 * task 2_1
 * @author Vlad Skrynyk
 */
public class task2_1 {
    public static void main(String args[]) {
        int x1 = 0x80000000;
        int x2 = 0xAAAAAAAA;

        System.out.println(" | : " + Integer.toBinaryString(x1 | x2));
        System.out.println(" ^ : " + Integer.toBinaryString(x1 ^ x2));
        System.out.println(" ~ : " + Integer.toBinaryString(~x1));
        System.out.println(" & : " + Integer.toBinaryString(x1 & x2));
        System.out.println(" >> : " + Integer.toBinaryString(x1 >> x2));
        System.out.println(" >>> : " + Integer.toBinaryString(x1 >>> x2));
        System.out.println(" << : " + Integer.toBinaryString(x1 << x2));

    }
}
