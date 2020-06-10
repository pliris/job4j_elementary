package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String str = "Неизвестное слово - " + eng;
        return str;
    }
    public static void main(String[] args) {
            DummyDic dic = new DummyDic();
            System.out.println(dic.engToRus("maven"));
    }
}
