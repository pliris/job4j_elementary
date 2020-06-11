package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorByName() {
        Comparator<Job> sortJobNameAtoZ = new SortNameAtoZ();
        List<Job> list = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Annotation", 4)
        );
        Collections.sort(list, sortJobNameAtoZ);
        List<Job> expected = Arrays.asList(
                new Job("Annotation", 4),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertEquals(expected, list);
    }

    @Test
    public void whenCompatorByPrority() {
        Comparator<Job> sortJobPriorityAtoZ = new SortPriorityAtoZ();
        List<Job> list = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Annotation", 4)
        );
        Collections.sort(list, sortJobPriorityAtoZ);
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Annotation", 4)
        );
        assertEquals(expected, list);
    }

    @Test
    public void whenCompatorByPriorityThenZToA() {
        Comparator<Job> sortJobPriorityZtoA = new SortPriorityZtoA();
        int rsl = sortJobPriorityZtoA.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );

        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPriorityFromZToA() {
        Comparator<Job> sortJobNamePriorityZtoA = new SortNameAtoZ().thenComparing(new SortPriorityZtoA());
        int rsl = sortJobNamePriorityZtoA.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );

        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityandNameFromAToZ() {
        Comparator<Job> cmp = new SortPriorityAtoZ().thenComparing(new SortNameAtoZ());
        List<Job> list = Arrays.asList(
                new Job("X task", 5),
                new Job("Fix bug", 5),
                new Job("Fix bug", 4),
                new Job("AAA", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("AAA", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 5),
                new Job("X task", 5)
        );
        Collections.sort(list, cmp);
        assertEquals(expected, list );

    }

}