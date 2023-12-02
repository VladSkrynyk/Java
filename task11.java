package task2_38;

public class task11 {
    public static void main(String[] args) {
        String input = "abbaaaccccdddddddeeee";

        char[] result = removeLongestSequence(input);
        System.out.println("Результат: " + new String(result));
    }

    private static char[] removeLongestSequence(String input) {
        if (input.isEmpty()) {
            return new char[0];
        }

        char[] chars = input.toCharArray();
        char currentChar = chars[0];
        int currentCount = 1;

        char maxChar = currentChar;
        int maxCount = currentCount;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxChar = currentChar;
                    maxCount = currentCount;
                }

                currentChar = chars[i];
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxChar = currentChar;
            maxCount = currentCount;
        }

        System.out.println("Символ найдовшої послідовності: " + maxChar);
        System.out.println("Довжина найдовшої послідовності: " + maxCount);

        String result = input.replaceAll(String.valueOf(maxChar) + "{1," + maxCount + "}", "");

        return result.toCharArray();
    }
}
