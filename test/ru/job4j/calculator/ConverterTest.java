package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert1000RblThen11Euro() {

        int euroIn = 1000;
        int euroExpected = 11;
        int euroOut = Converter.rubleToEuro(euroIn);
        Assert.assertEquals(euroExpected, euroOut);
    }

    @Test
    public void whenConvert1000RblThen13Dollars() {
        int dollarIn = 1000;
        int dollarExpected = 13;
        int dollarOut = Converter.rubleToDollar(dollarIn);
        Assert.assertEquals(dollarExpected, dollarOut);
    }
}