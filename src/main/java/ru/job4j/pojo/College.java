package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Nikita");
        student.setGroup("5");
        student.setReciept("01.05.2020");
        System.out.println(student.getFio() + " "
                + student.getGroup() + " "
                + student.getReciept());
    }
}
