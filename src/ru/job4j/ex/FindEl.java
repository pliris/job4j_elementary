package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++ ) {
            if (value[i].equals(key)) {
                return rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("String not found");
        }
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