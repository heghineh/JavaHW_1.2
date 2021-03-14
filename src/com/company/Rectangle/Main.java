package com.company.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height than the width of your rectangle.");
        Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

        System.out.println("Perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Area = " + rectangle.calculateArea());
    }
}