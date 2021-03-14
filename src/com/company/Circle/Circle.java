package com.company.Circle;

public class Circle {
    //region Properties
    private double radius;
    //endregion

    //region Constructors
    public Circle() {
    }

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;

        } else {
            System.out.println("Invalid radius!");
        }
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
    //endregion

    //region Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //endregion
}
