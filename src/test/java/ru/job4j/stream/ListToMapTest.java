package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void whenCollect2EqualFrom3Then2Student() {
        List<Student> list = Arrays.asList(
                new Student("Popov", 56),
                new Student("Ivanov", 45),
                new Student("Popov", 55)
        );
        Map<String, Student> result = ListToMap.collect(list);
        Map<String, Student> expected = Map.of(
          "Popov", new Student("Popov", 56),
                "Ivanov", new Student("Ivanov", 45)
        );
        assertThat(result, is(expected));
    }
}