package Manager;

import java.util.Scanner;
/**
 * task 1_13
 * @author Vlad Skrynyk
 */
public class Manager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = 500; // Кількість кандидатів, яких ви будете оцінювати
        int interviewTime = N / 2; // Час інтерв'ю для перших N/2 кандидатів

        double bestCandidateRating = 0; // Рейтинг найкращого кандидата, якого ви побачили

        // Проведення інтерв'ю з першою половиною кандидатів
        for (int i = 0; i < interviewTime; i++) {
            double candidateRating = scanner.nextDouble(); // Введіть рейтинг кандидата
            bestCandidateRating = Math.max(bestCandidateRating, candidateRating);
        }

        // Пошук кращого кандидата протягом наступних 2 хвилин
        for (int i = interviewTime; i < N; i++) {
            double candidateRating = scanner.nextDouble(); // Введіть рейтинг кандидата
            if (candidateRating > bestCandidateRating) {
                System.out.println("Обраний кандидат з рейтингом: " + candidateRating);
                return;
            }
        }

        System.out.println("Кращого кандидата не знайдено. Обраний кандидат з рейтингом: " + bestCandidateRating);
    }
}
