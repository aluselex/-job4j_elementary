package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] end) {
        boolean result = true;
        for (int i = 0; i < end.length; i++) {
            if (word[word.length - 1 - i] != end[end.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
