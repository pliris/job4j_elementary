package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = second > first ? second : first;
        return result;
    }
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
    public static int max(int first, int second, int third, int fourth) {
       return max(max(first, second), max(third, fourth));
    }

}