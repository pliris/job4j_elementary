package ru.job4j.search;

import ru.job4j.collection.Job;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> name = n -> n.getName().equals(key);
        Predicate<Person> surname = s -> s.getSurname().equals(key);
        Predicate<Person> phone = p -> p.getPhone().equals(key);
        Predicate<Person> address = a -> a.getAddress().equals(key);
        Predicate<Person> combine = name.or(surname).or(phone).or(address);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;


//        for (Person person : persons) {
//            if (person.getAddress().contains(key) || person.getName().contains(key)
//                    || person.getPhone().contains(key) || person.getSurname().contains(key)) {
//                result.add(person);
//            }
//        }
    }

}