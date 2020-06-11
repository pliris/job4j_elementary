package ru.job4j.array;

import org.junit.Test;



import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {

        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to7() {
        int[] input = {0, 1, 2, 5, 3, 9, 4, 11};
        int[] expect = {0, 1, 4, 5, 3, 9, 2, 11};
        int[] rsl = SwitchArray.swap(input, 2, 6);
        assertThat(rsl, is(expect));

    }

    @Test
    public void whenSwap1to4() {
        int[] input = {0, 1, 2, 3, 5};
        int[] expect = {0, 5, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 1, 4);
        assertThat(rsl, is(expect));
    }
}