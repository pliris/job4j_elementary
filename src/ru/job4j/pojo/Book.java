package ru.job4j.pojo;

public class Book {
    private String name;
    private int countPages;

    public Book(String name, int count) {
        this.name = name;
        this.countPages = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}
