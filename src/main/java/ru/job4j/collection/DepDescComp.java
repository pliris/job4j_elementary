package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int rsl = 0;
        String[] strFirst = first.split("/");
        String[] strSecond = second.split("/");
        rsl = strSecond[0].compareTo(strFirst[0]);
        if (rsl == 0) {
            for (int index = 1; index < Math.min(strFirst.length, strSecond.length); index++) {
                rsl = strFirst[index].compareTo(strSecond[index]);
                if (rsl != 0) {
                    break;
                }
            }
            if (rsl == 0) {
                rsl = Integer.compare(strFirst.length, strSecond.length);
            }
        }
        return rsl;
    }
}