package ru.job4j.pojo;

import org.junit.Test;


import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setOwner("Mike");
        first.setModel("model");
        first.setCode("audio");
        Date date = new Date();
        first.setCreated(date);
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));

    }
}