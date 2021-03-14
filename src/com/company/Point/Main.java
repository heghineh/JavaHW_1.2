package com.company.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X and Y coordinates of point A.");
        Point point = new Point(sc.nextInt(), sc.nextInt());

        System.out.println("Enter X and Y coordinates of point B.");
        Point point1 = new Point(sc.nextInt(), sc.nextInt());

        System.out.println("Distance from A(" + point.getCoordinateX() + "," + point.getCoordinateY() + ") to O(0,0) = " + point.distance()
                + "\nDistance from B(" + point1.getCoordinateX() + "," + point1.getCoordinateY() + ") to O(0,0) = " + point.distance()
                + "\nDistance from A(" + point.getCoordinateX() + "," + point.getCoordinateY() +
                ") to B(" + point1.getCoordinateX() + "," + point1.getCoordinateY() + ") = " + point.distance(point1));
    }
}