package ru.job4j.oop;

public class Predator extends Animal {
    public String name;

    public Predator() {
        super();
        System.out.println("load Predator");
    }
    public Predator(String n) {
        this.name = n;
    }

    public static void  main(String[] args) {
        Predator predator = new Predator();
    }
}
