package task2;

public class task2 {
    public static void main(String[] args) {
        String text;

        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            text = "Це приклад тексту для обернення.";
        }

        String reversedText = reverseText(text);
        System.out.println("Обернений текст: " + reversedText);
    }

    private static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
