package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bClean = new Book("Clean code", 450);
        Book bThink = new Book("Thinking in Java", 900);
        Book bHead = new Book("Head First", 600);
        Book bProf = new Book("Java Professional", 1800);
        Book temp = new Book(null, 0);
        Book[] books = new Book[4];
        books[0] = bClean;
        books[1] = bThink;
        books[2] = bHead;
        books[3] = bProf;
        System.out.println("Print first time books array");
        for (Book b : books) {
            System.out.println(b.getName() + " " + b.getCountPages() + " pages");
        }
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Print books array after change");
        for (Book b : books) {
            System.out.println(b.getName() + " " + b.getCountPages() + " pages");
        }
        System.out.println("Print books array, if has Clean code name");
        for (Book b : books) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " " + b.getCountPages() + " pages");
            }
        }

    }
}
