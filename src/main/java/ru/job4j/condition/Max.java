package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = right > left ? right : left;
        return result;
    }
}
