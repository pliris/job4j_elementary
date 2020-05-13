package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(2, 2);
        Point bp = new Point(1, 1);
        Point cp = new Point(3, 3);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
//        boolean result = Triangle.area(ap, bp, cp);
        assertThat(result, is(true));
    }
//    @Test
//    public void whenNotExist() {
//        boolean result = Triangle.area(7.0, 0.0, 9.0);
//        assertThat(result, is(false));
//    }
}