package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start == "") {
                    tmp.add(el);
                    start = el;
                } else {
                    start = start + "/" + el;
                    tmp.add(start);
                }
            }
        }
        List<String> list = new ArrayList<>(tmp);
        Collections.sort(list);
        return list;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}