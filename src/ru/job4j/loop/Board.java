package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int x = 0; x<=width; x++ ) {
            for (int y = 0; y<=height; y++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((x + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(2, 2);
        System.out.println();
        paint(3, 3);
    }
}