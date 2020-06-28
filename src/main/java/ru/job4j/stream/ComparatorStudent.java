package ru.job4j.stream;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {
    @Override
    public int compare(Student left, Student right) {
        return left.getSurname().compareTo(right.getSurname());
    }

}
