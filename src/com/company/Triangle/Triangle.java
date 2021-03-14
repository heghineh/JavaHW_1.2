package com.company.Triangle;

public class Triangle {
    //region Properties
    private double sideA;
    private double sideB;
    private double sideC;
    //endregion

    //region Constructors
    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Invalid triangle!");
        }
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double semiperimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }
    //endregion

    //region Getters and Setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    //endregion
}
