package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int index = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}