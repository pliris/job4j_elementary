package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        List<Address> list = new ArrayList<>();
        Comparator<Address> cmpAdr = new ComparatorAddress();
        list = profiles.stream().map(
                a -> a.getAddress()
        ).sorted(cmpAdr).distinct().collect(Collectors.toList());
        return list;
    }
}
