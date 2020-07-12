package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<String, Student> collect(List<Student> students) {
        Map<String, Student> map = students.stream().collect(
                Collectors.toMap(student -> student.getSurname(), student -> student, (student, same) -> student));
        return map;
    }
}
