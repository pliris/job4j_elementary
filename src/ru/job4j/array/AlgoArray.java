package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp;
        for (int i = 1; i < array.length; i++) {
            int y = 1;
            while (y < array.length) {
                if (array[y - 1] > array[y]) {
                    temp = array[y];
                    array[y] = array[y - 1];
                    array[y - 1] = temp;
                }
            y++;
            }
        }
//        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
//        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
//        array[3] = temp;
//
//        temp = array[1]; // записываем в ячейку с индексом 3 значение временной переменной.
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}