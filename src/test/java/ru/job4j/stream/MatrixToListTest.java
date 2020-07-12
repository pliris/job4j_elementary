package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenMatrixListInListThenCollectToList() {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(0, 9, 8, 7, 6)
        );
        List<Integer> result = MatrixToList.collect(list);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 0, 9, 8, 7, 6);
        assertEquals(expected, result);
    }
}