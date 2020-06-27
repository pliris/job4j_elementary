package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenScoreFrom70To100ThenClassA() {
        List<Student> list = Arrays.asList(
                new Student("Popov", 89),
                new Student("Lermontov", 56),
                new Student("Ivanov", 70),
                new Student("Smirnov", 12)
        );
        List<Student> result = School.collect(list, p -> p.getScore() >= 70);
        List<Student> expected = Arrays.asList(
                new Student("Popov", 89),
                new Student("Ivanov", 70)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenScoreFrom50To70ThenClassB() {
        List<Student> list = Arrays.asList(
                new Student("Popov", 89),
                new Student("Lermontov", 56),
                new Student("Ivanov", 70),
                new Student("Smirnov", 12)
        );
        List<Student> result = School.collect(list, p -> p.getScore() >= 50 && p.getScore() < 70);
        List<Student> expected = Arrays.asList(
                new Student("Lermontov", 56)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenScoreFrom0To50ThenClassC() {
        List<Student> list = Arrays.asList(
                new Student("Popov", 89),
                new Student("Lermontov", 56),
                new Student("Ivanov", 70),
                new Student("Smirnov", 12)
        );
        List<Student> result = School.collect(list, p -> p.getScore() < 50);
        List<Student> expected = Arrays.asList(
                new Student("Smirnov", 12)
        );
        assertThat(result, is(expected));
    }

}