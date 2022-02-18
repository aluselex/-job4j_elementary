package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int right = 1;
        int left = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2Then1() {
        int right = 2;
        int left = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To3Then3() {
        int right = 3;
        int left = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}