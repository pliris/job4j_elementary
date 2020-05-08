package ru.job4j.array;

import java.util.Arrays;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                array[i][y] = n;
                n++;
                System.out.print(array[i][y] + " ");
            }
            }

    }

}
