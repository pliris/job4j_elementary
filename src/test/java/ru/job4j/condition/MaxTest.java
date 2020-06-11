package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax11To3Then7() {
        int result = Max.max(3, 7, 11);
        assertThat(result, is(11));
    }
    @Test
    public void whenMaxFrom4NumbersThen10() {
        int result = Max.max(3, 6, 2, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenNotMax() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

}