package ru.job4j.oop;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("load Animal");
    }
    public Animal(String n) {
        this.name = n;
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}

