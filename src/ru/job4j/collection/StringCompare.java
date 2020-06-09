package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int index = 0;
        int rsl = 0;
        char chL = '\u0000';
        char chR = '\u0000';
        while (index < left.length() | index < right.length()) {
            if (index < left.length()) {
                chL = left.charAt(index);
            } else {
                chL = 0;
            }
            if (index < right.length()) {
                chR = right.charAt(index);
            } else {
                chR = 0;
            }
            rsl = rsl + Integer.compare(chL, chR);
            index++;
        }
        return rsl;
    }
}