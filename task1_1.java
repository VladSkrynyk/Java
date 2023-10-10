package task1_1;
/**
 * task 1_1
 * @author Vlad Skrynyk
 */
public class task1_1 {
    public static void main(String args[]) {
        String [] arr = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }
    }
}
