package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 45;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        int in = 140;
        int expectedEuro = 2;
        int expectedDollar = 3;
        int out = rubleToEuro(in);
        boolean passedEuro = expectedEuro == out;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        out = rubleToDollar(in);
        boolean passedDollar = expectedDollar == out;
        System.out.println("140 rubles are 3. Test result : " + passedDollar);
        System.out.println("140 rubles are " + euro + " euro. 140 rubles are " + dollar);
    }
}
