package ru.job4j.loop;

import java.util.concurrent.Callable;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 1; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count += 1;
                }
            }
        return count;
    }
    }

