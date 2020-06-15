package ru.job4j.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorString {

    public String compareTo(String o) {
        String compareString = null;
        TreeSet<Character> characters = new TreeSet<>();
        for (int i = 0; i < o.length(); i++) {
            characters.add(o.charAt(i));
        }
        for (Character ch : characters) {
            compareString = (compareString != null) ? compareString + ch : ch.toString();
        }
        return compareString;
    }
}
