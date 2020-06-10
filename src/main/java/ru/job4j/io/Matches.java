package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        int player = 0;
        int count = 11;
        while (count > 0) {
            player++;
            System.out.println("Сколько берете спичек?");
            select = Integer.valueOf(sc.nextLine());
            if (select <= 3 & select <= count) {
                count -= select;
                System.out.println(count + System.lineSeparator() + "Переход хода");
            } else {
                System.out.println("Введите число от 1 до 3, либо число больше количества спичек оставшихся на столе.");
            }
        }
        if (player % 2 == 0) {
            System.out.println("Игра окончена. Победил игрок 2");
        } else {
            System.out.println("Игра окончена. Победил игрок 1");

        }
    }
}
