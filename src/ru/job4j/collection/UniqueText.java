package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String strOrg : origin) {
            check.add(strOrg);
        }
        for (String strText : text) {
            if (check.contains(strText)) {
                rsl = true;
            }
        }
        // for-each origin -> new HashSet.
        // for-each text -> hashSet.contains
        return rsl;
    }
}