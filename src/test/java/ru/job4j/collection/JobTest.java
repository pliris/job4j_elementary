package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorByName() {
        Comparator<Job> sortJobNameAtoZ = new SortNameAtoZ();
        List<Job> list = new ArrayList<>(List.of(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Annotation", 4)
        ));
        Collections.sort(list, sortJobNameAtoZ);
        List<Job> expected = List.of(
                new Job("Annotation", 4),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertEquals(expected, list);
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> sortJobPriorityAtoZ = new SortPriorityAtoZ();
        List<Job> list = new ArrayList<>(List.of(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Annotation", 4)
        ));
        list.sort(sortJobPriorityAtoZ);
        List<Job> expected = List.of(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Annotation", 4)
        );
        assertEquals(expected, list);
    }

    @Test
    public void whenComparatorByPriorityThenZToA() {
        Comparator<Job> sortJobPriorityZtoA = new SortPriorityZtoA();
        int rsl = sortJobPriorityZtoA.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );

        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityFromZToA() {
        Comparator<Job> sortJobNamePriorityZtoA = new SortNameAtoZ().thenComparing(new SortPriorityZtoA());
        int rsl = sortJobNamePriorityZtoA.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );

        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndNameFromAToZ() {
        Comparator<Job> cmp = new SortPriorityAtoZ().thenComparing(new SortNameAtoZ());
        List<Job> list = new ArrayList<>(List.of(
                new Job("X task", 5),
                new Job("Fix bug", 5),
                new Job("Fix bug", 4),
                new Job("AAA", 1)
        ));
        List<Job> expected = List.of(
                new Job("AAA", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 5),
                new Job("X task", 5)
        );
        Collections.sort(list, cmp);
        assertEquals(expected, list);

    }

}