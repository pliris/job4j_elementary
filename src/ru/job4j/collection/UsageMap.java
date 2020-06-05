package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("mail@mail.ru", "Ivan Alexeev");
        hashMap.put("google@mail.ru", "Artem Petrov");
        hashMap.put("yahoo@mail.ru", "Oleg Sidorov");
        for (String strKey : hashMap.keySet()) {
             String strValue = hashMap.get(strKey);
             System.out.println(strKey + " " + strValue);
        }
        System.out.println("Вывод через keyset(), get(key)" + System.lineSeparator());

        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            String strKey = map.getKey();
            String strValue = map.getValue();
            System.out.println(strKey + " " + strValue);
        }
        System.out.println("Вывод через map.entrySet()");
    }
}
