package com.company.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of your circle:  ");
        Circle circle = new Circle(sc.nextInt());

        System.out.println("Perimeter = " + circle.calculatePerimeter());
        System.out.println("Area = " + circle.calculateArea());
    }
}