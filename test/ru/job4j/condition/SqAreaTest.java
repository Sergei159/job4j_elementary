package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void When_p4_k1_Then1() {
        int p = 4;
        double  k = 1;
        double out = SqArea.square(p, k);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void When_p6_k2_Then2() {
        int p = 6;
        double  k = 2;
        double out = SqArea.square(p, k);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void When_p1_k2_Then0_055() {
        int p = 1;
        double  k = 2;
        double out = SqArea.square(p, k);
        double expected = 0.055;
        Assert.assertEquals(expected, out, 0.01);
    }
}