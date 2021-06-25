package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 86;
    }

    public static int rubleToDollar(int value) {

        return value / 72;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        int dollar = Converter.rubleToDollar(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " $.");
    }
}

