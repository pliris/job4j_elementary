package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        int count = 11;
        while (count > 0) {
            System.out.println("Сколько берете спичек?");
            if ((select = Integer.valueOf(sc.nextLine())) <= 3 & select <= count) {
                count -= select;
                System.out.println(count + System.lineSeparator() + "Переход хода");
            } else {
                System.out.println("Введите число от 1 до 3, либо число больше количества спичек оставшихся на столе.");
            }
        }
        System.out.println("Игра окончена.");
    }
}