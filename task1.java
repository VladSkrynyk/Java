package task1;

public class task1 {
    public static void main(String[] args) {
        String text;

        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            text = "Це приклад тексту. Тут ми підраховуємо кількість слів.";
        }

        int wordCount = countWords(text);
        System.out.println("Кількість слів в тексті: " + wordCount);
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
