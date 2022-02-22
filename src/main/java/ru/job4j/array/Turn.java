package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            if (array.length - 2 * i - 1 == 0 || array.length - 2 * i - 1 == 1) {
                break;
            }
        }
        return array;
    }
}
