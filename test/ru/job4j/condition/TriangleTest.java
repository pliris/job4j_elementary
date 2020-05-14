package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExistThen05() {
        Point ap = new Point(1, 2);
        Point bp = new Point(4, 4);
        Point cp = new Point(3, 3);
        Triangle triangle = new Triangle(ap, bp, cp);
        double except = triangle.area();
        double out = 0.5;
        assertEquals(except, out, 0.01);
    }
    @Test
    public void whenNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 0);
        Point cp = new Point(0, 0);
        Triangle triangle = new Triangle(ap, bp, cp);
        double except = triangle.area();
        int out = -1;
        assertEquals(except, out, 0.01);
    }

    @Test
    public void whenExistThen() {
        Point ap = new Point(1, 9);
        Point bp = new Point(5, 4);
        Point cp = new Point(3, 3);
        Triangle triangle = new Triangle(ap, bp, cp);
        double except = triangle.area();
        double out = 7.0;
        assertEquals(except, out, 0.01);
    }
}