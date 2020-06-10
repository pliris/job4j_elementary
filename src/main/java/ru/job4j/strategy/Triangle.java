package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder(System.lineSeparator());
        sb.append("   *   ");
        sb.append(System.lineSeparator());
        sb.append("  * *  ");
        sb.append(System.lineSeparator());
        sb.append(" *   * ");
        sb.append(System.lineSeparator());
        sb.append("*******");
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
