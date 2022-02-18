package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayRightUpIs2() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 4;
        int y2 = 2;
        int expected = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayRightDownIs1() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 5;
        int y2 = 1;
        int expected = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayLeftUpIs3() {
        int x1 = 5;
        int y1 = 1;
        int x2 = 2;
        int y2 = 4;
        int expected = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayLeftDownIs1() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 1;
        int y2 = 3;
        int expected = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wrongWayIs0() {
        int x1 = 5;
        int y1 = 1;
        int x2 = 4;
        int y2 = 1;
        int expected = 0;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}

