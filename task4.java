package task4;

import CFtask4.CFtask4;
/**
 * task 2
 * @author Vlad Skrynyk
 * @file task4.html
 */
public class task4 {
    public static void main(String[] args) {
        CFtask4 instance1 = CFtask4.getInstance();
        CFtask4 instance2 = CFtask4.getInstance();

        // Перевірка, що обидва об'єкти вказують на один і той самий екземпляр
        System.out.println(instance1 == instance2); // Виведе true

    }
}
