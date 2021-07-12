package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 86;
    }

    public static int rubleToDollar(int value) {
        return value / 72;
    }

    public static void main(String[] args) {
        int euroIn = 1000;
        int euroExpected = 11;
        int euroOut = Converter.rubleToEuro(euroIn);
        boolean euroPassed = euroExpected == euroOut;
        System.out.println("1000 rubles are 11 euro . Test result : " + euroPassed);

        int dollarIn = 1000;
        int dollarExpected = 13;
        int dollarOut = Converter.rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;
        System.out.println("1000 rubles are 13 $ . Test result : " + dollarPassed);
    }
}

