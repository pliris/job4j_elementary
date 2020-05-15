package ru.job4j.oop;

public class Tiger extends Predator {
    public String name;

    public Tiger() {
        super();
        System.out.println("load Tiger");
    }
    public Tiger(String n) {
        this.name = n;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("fedor");
    }
}

