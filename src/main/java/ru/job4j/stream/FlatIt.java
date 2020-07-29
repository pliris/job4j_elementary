package ru.job4j.stream;

import java.util.*;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        final List<Integer> list = new ArrayList<>();
        Spliterator<Iterator<Integer>> spl = Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED);
//        while (it.hasNext()) {
//            Iterator iterator = it.next();
//            while (iterator.hasNext()) {
//                list.add((Integer) iterator.next());
//            }
//        }
        StreamSupport.stream(spl, false)
                .spliterator()
                .forEachRemaining(i -> i.forEachRemaining(ir -> list.add(ir)));
        return list;
    }
}