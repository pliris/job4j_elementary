package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String str : value) {
            if (str == key) {
                throw new ElementNotFoundException();
            }
        }
        // for-each
        return rsl;
    }
    public static void main(String[] args) {
        String[] val = new String[] {"element", "element 2"};
        try {
            indexOf(val, "test");
        } catch (ElementNotFoundException e) {
                e.printStackTrace();
        }
    }
}