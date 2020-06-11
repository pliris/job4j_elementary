package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.valueOf;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       int l = 0;
       int r = 0;
       String[] indexL = new String[2];
       indexL = left.split(".");
       String[] indexR = new String[2];
       indexR = right.split(".");
       l = Integer.valueOf(indexL[0]);
       r = Integer.valueOf(indexR[0]);
       return  Integer.compare(l, r);
    }
}