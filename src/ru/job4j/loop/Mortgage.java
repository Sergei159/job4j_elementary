package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        percent *= 0.01;
        double remainder = amount * (1 + percent)  - salary;

        while (remainder > 0) {
            remainder += remainder * percent;
            remainder -= salary;
            year++;
         }
        return year;
    }
}