package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[10500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Nikita";
        names[1] = "Alexey";
        names[2] = "Nina";
        names[3] = "Lena";
        for (int i = 0; i < 4; i++) {
        System.out.println(names[i].toString());
        }
    }
}
