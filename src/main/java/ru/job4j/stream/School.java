package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        Predicate<Student> predicateA = s -> s.getScore() >= 70;
        Predicate<Student> predicateB = s -> 50 <= s.getScore() && s.getScore() < 70;
        Predicate<Student> predicateC = s -> s.getScore() < 50;
        Predicate<Student> combine = predicateA.or(predicateB).or(predicateC);
        List<Student> list = students.stream().
                filter(predict).collect(Collectors.toList());
        return list;
    }
}
