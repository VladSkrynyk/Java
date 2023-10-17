package task2_2;
/**
 * task 2_2
 * @author Vlad Skrynyk
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task2_2 {
    String surname;
    int id;
    String name;
    String secondName;
    String adress;
    int num_card;
    int num_bank;

    public task2_2(
            String s1, String s2, String s3, int id, String ad,
            int ncr, int nb
    ) {
        this.name = s1;
        this.surname = s2;
        this.secondName = s3;
        this.id = id;
        this.adress = ad;
        this.num_card = ncr;
        this.num_bank = nb;
    }

    public String getName() {
        return this.name;
    }
    public int getCard() {
        return this.num_card;
    }

    public void printStudent() {
        System.out.println("Customer: " + this.name);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        task2_2[] customers = {
                new task2_2("e1", "S1", "P1", 1, "a1", 4, 10),
                new task2_2("b2", "S2", "P2", 2, "a2", 8, 11),
                new task2_2("a3", "S3", "P3", 3, "a3", 3, 12),
                new task2_2("d4", "S4", "P4", 4, "a4", 5, 13),
                new task2_2("c5", "S5", "P5", 5, "a5", 1, 14),
        };

        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < customers.length; i++) {
            ar.add(customers[i].getName());
        }
        ar.sort(String::compareToIgnoreCase);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }


        System.out.println("Ввдіть діапазон: ");
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = 0; i < customers.length; i++) {
            if ((a < customers[i].getCard()) && (customers[i].getCard() < b)) {
                System.out.println(customers[i].getName());
            }
        }
    }

}
