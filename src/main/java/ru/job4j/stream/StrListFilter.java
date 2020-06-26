package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StrListFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 6, 9, 0, -98);
        list = list.stream().filter(i -> i.intValue() > 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
