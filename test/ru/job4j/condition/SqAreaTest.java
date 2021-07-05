package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void WhenP4AndK1Then1() {
        int p = 4;
        double  k = 1;
        double out = SqArea.square(p, k);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenP6AndK2Then2() {
        int p = 6;
        double  k = 2;
        double out = SqArea.square(p, k);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenP1AndK2Then55Thousandth() {
        int p = 1;
        double  k = 2;
        double out = SqArea.square(p, k);
        double expected = 0.055;
        Assert.assertEquals(expected, out, 0.01);
    }
}