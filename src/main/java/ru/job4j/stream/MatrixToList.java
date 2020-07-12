package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MatrixToList {
    public static List<Integer> collect(List<List<Integer>> matrix) {
        List<Integer> list = matrix.stream().flatMap(List::stream).collect(Collectors.toList());
        return list;
    }

}
