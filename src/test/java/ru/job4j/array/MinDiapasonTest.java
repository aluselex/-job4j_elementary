package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int exprcted = 0;
        Assert.assertEquals(exprcted, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int exprcted = 1;
        Assert.assertEquals(exprcted, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(array, start, finish);
        int exprcted = 2;
        Assert.assertEquals(exprcted, result);
    }
}