
import task1.task1;

import task2.task2;

import task2_1.Student;
import task3.AccessModifiersExample;

import task5.Debug.Log;
import static task5.Debugoff.Log.log;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task1_1
        // task1 t = new task1();
        // Scanner s = new Scanner(System.in);
        // t.input(s);
        // System.out.println(t.toStr());

        // task1_2
        // task2 t = new task2();
        // t.x; -- error
        // System.out.println(t.getVal()); -- correct

        // task1_3
        // AccessModifiersExample obj = new AccessModifiersExample();

        // System.out.println(obj.publicField);
        // obj.publicMethod();

        // System.out.println(obj.privateField); // Помилка компіляції
        // obj.privateMethod(); // Помилка компіляції

        // System.out.println(obj.protectedField);
        // obj.protectedMethod();

        // System.out.println(obj.packagePrivateField);
        // obj.packagePrivateMethod();

        // task1_4
        // in task4 package

        // task1_5
        // Log l = new Log();
        // l.log("1", "2", "3");

        // task2_1
        // Student[] students = {
        // new Student("Vlad", "Skrynyk", "s3", 2004, "v1", "+1", "MM", 3, 1),
        //        new Student("Vitalii", "Reshetnyk", "s3", 2003, "v2", "+2", "MM", 3, 1),
        //        new Student("Oleg", "Chaichenko", "s3", 2004, "v3", "+3", "MM1", 3, 1),
        //        new Student("Sasha", "Mikyshova", "s3", 2002, "v4", "+4", "MM", 3, 2),
        //        new Student("Sasha", "Mandrenko", "s3", 2005, "v5", "+5", "MM1", 3, 2),
        // };
        // Scanner s = new Scanner(System.in);
        // String faculty;
        // int year_birth;
        // int group;
        //
        // System.out.print("Введіть факультет: ");
        // faculty = s.nextLine();
        // System.out.print("Введіть рік: ");
        // year_birth = s.nextInt();
        // System.out.print("Введіть групу: ");
        // group = s.nextInt();
        //
        // for (int i = 0; i < students.length; i++) {
        //    if (students[i].getFaculty().equals(faculty)) {
        //       students[i].printStudent();
        //    }
        // }
        // for (int i = 0; i < students.length; i++) {
        //    students[i].printStudent();
        // }
        // for (int i = 0; i < students.length; i++) {
        //     if (students[i].getYear() > year_birth) {
        //        students[i].printStudent();
        //    }
        // }
        // for (int i = 0; i < students.length; i++) {
        //     if (students[i].getGroup() == group) {
        //        students[i].printStudent();
        //    }
        // }
    }
}