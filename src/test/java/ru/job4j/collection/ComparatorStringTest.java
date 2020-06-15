package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorStringTest {
    @Test
    public void whenACBEThenABCE() {
        String actual = "ACBE";
        String expected = "ABCE";
        ComparatorString cmpStr = new ComparatorString();
        assertEquals("ABCE", cmpStr.compareTo(actual));
    }

}