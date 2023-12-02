package task2_38;

public class task13 {
    public static void main(String[] args) {
        String input = "aabcbb";

        String result = replaceAdjacentDuplicates(input);
        System.out.println("Результат: " + result);
    }

    private static String replaceAdjacentDuplicates(String input) {
        if (input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}
