package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.MinDiapason;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }

    @Test
    public void whenMiddle2Min() {
        assertThat(MinDiapason.findMin(
                            new int[] {6, 1, 0, 1, 3, 9}, 1, 4
                ),
                is(0)
        );
    }
}