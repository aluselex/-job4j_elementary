package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {1, 2, 3};
        int result = Min.findMin(array);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {2, 3, 1};
        int result = Min.findMin(array);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {2, 1, 3};
        int result = Min.findMin(array);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}