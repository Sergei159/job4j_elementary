package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {

        return 1.15 * (height - 100);
    }

    public static double womanWeight(short height) {
        return 1.15 * (height - 110);
    }

    public static void main(String[] args) {
        short heightMan = 180;
        short heightWoman = 160;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 180 is " + man);
        System.out.println("woman 160 is " + woman);
    }
}
