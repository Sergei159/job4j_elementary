package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                if (point < index) {
                    String temp = array[point];
                    array[point] = array[index];
                    array[index] = temp;
                }
                point++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
