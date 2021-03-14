package com.company.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c sides of your triangle.");
        Triangle triangle = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Perimeter = " + triangle.calculatePerimeter());
        System.out.println(("Area = " + triangle.calculateArea()));
    }
}