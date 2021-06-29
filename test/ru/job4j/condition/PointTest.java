package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class PointTest {

    @Test
    public void when_0_0_And_2_0_Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when_0_0_And_10_5_Then11_18() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 10;
        int y2 = 5;
        double expected = 11.18;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when_5_5_And_10_5_Then5() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 5;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}