package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int step = 0; step < data.length - 1; step++) {
            int min = MinDiapason.findMin(data, step, data.length - 1);
            int index = FindLoop.indexOf(data, min, step, data.length - 1);
            data = SwitchArray.swap(data, index, step);
           }
        return data;
    }
}