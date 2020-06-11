package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPoint124435ThenDist() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 4;
        int z1 = 3;
        int z2 = 5;
        Point pointOne = new Point(x1, y1, z1);
        Point pointTwo = new Point(x2, y2, z2);
        double expected = 4.1;
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.1);
    }
}