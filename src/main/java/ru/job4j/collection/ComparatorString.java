package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorString {

    public String compareTo(String o) {

//        TreeSet<Character> characters = new TreeSet<>();
//        for (int i = 0; i < o.length(); i++) {
//            characters.add(o.charAt(i));
//        }
//        for (Character ch : characters) {
//            compareString = (compareString != null) ? compareString + ch : ch.toString();
//        }
//        return compareString;
        char[] chars = o.toCharArray();
        Arrays.sort(chars);
        String compareString = new String(chars);
        return compareString;
    }
}
