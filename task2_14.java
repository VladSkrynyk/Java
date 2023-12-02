package task2_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        int totalWords = countWords(input);
        System.out.println("a) Кількість усіх слів: " + totalWords);

        System.out.print("б) Слова, що починаються із цифри: ");
        countAndPrintWordsStartingWithDigit(input);

        System.out.print("в) Слова, що закінчуються трьохзначним числом: ");
        countAndPrintWordsEndingWithThreeDigitNumber(input);

        int wordsStartingAndEndingWithSameWord = countWordsStartingAndEndingWithSameWord(input);
        System.out.println("г) Кількість слів, що починаються і закінчуються одним словом: " +
                wordsStartingAndEndingWithSameWord);

        int emailWordsCount = countEmailWords(input);
        System.out.println("д) Кількість слів, що є електронною поштою: " + emailWordsCount);
    }

    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }

    private static void countAndPrintWordsStartingWithDigit(String input) {
        Pattern pattern = Pattern.compile("\\b\\d\\w*\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        System.out.println();
    }

    private static void countAndPrintWordsEndingWithThreeDigitNumber(String input) {
        Pattern pattern = Pattern.compile("\\b\\w*\\d{3}\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        System.out.println();
    }

    private static int countWordsStartingAndEndingWithSameWord(String input) {
        int count = 0;
        String[] words = input.split("\\s+");

        for (String word : words) {
            if (word.length() > 1 && word.charAt(0) == word.charAt(word.length() - 1)) {
                count++;
            }
        }

        return count;
    }

    private static int countEmailWords(String input) {
        Pattern pattern = Pattern.compile("\\b\\w+@\\w+\\.\\w+\\b");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
