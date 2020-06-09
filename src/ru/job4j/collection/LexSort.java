package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.valueOf;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       int index = 0;
       Integer indexL = left.lastIndexOf(" ");
       Integer indexR = right.lastIndexOf(" ");
       indexL = Integer.valueOf(left.substring(index, indexL - 1));
       indexR = Integer.valueOf(right.substring(index, indexR - 1));
       return indexL.compareTo(indexR);
    }
}