package org.example;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        Point point2 = new Point(3,4);
        System.out.println("P1 ile P2 arasindaki mesafe" + point1.distance(point2));
        System.out.println("p1 ile 10,12 arasindaki mesafe " + point2.distance(10,12));
        System.out.println("p1 in sifir noktasina uzakligi " + point1.distance());
    }
}