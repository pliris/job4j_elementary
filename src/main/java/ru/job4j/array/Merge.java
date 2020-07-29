package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iRsl = 0;
        int iL = 0;
        int iR = 0;
        while (iRsl < rsl.length) {
            if (iL > left.length - 1) {
                rsl[iRsl] = right[iR];
                iR++;
            } else if (iR > right.length - 1) {
                rsl[iRsl] = left[iL];
                iL++;
            } else if (left[iL] <= right[iR]) {
                rsl[iRsl] = left[iL];
                iL++;
            } else {
                rsl[iRsl] = right[iR];
                iR++;
            }
            iRsl++;
        }
        return rsl;
    }
}