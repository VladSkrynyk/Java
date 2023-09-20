package task1_6;

/**
 * task 1_6
 * @author Vlad Skrynyk
 */
public class task1_6 {
    public static void main(String args[]) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("spot");
        dog2.setName("scruffy");

        dog1.setSay("Ruff!");
        dog2.setSay("Wurf!");

        dog1.voice();
        dog2.voice();

        System.out.println("Порівнюємо за допомогою ==:");
        System.out.print(dog1 == dog2);

        System.out.println("\nПорівнюємо за допомогою equals():");
        System.out.println(dog1.equals(dog2));

        Dog anotherSpot = dog1;

        System.out.println("\nПорівнюємо нове посилання зі dog1 за допомогою ==:");
        System.out.print(anotherSpot == dog1);

        System.out.println("\nПорівнюємо нове посилання зі dog1 за допомогою equals():");
        System.out.print(anotherSpot.equals(dog1));
    }
}
