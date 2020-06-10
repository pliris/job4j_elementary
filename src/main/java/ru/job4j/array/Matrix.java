package ru.job4j.array;

public class Matrix {
        public int[][] multiple(int size) {
            int[][] table = new int[size][size];
            for (int i = 1; i <= size; i++) {
                for (int y = 1; y <= size; y++) {
                    table[i - 1][y - 1  ] = i * y;
                }
            }
            return table;
        }
    }