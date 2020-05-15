package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        }
        return rsl;
    }
    private boolean exist(double a, double b, double c) {
        return (a + c > b && a + c > b && b + c > a);

    }

//    public static void main(String[] args) {
//        double rsl = Triangle.area(2, 2, 2);
//        System.out.println("area (2,2,2) = " + rsl);
//
//    }
}


