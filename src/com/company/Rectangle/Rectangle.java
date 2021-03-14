package com.company.Rectangle;

public class Rectangle {
    //region Properties
    private double height;
    private double width;
    //endregion

    //region Constructors
    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        if (height >= 0 && width >= 0) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Invalid parameter or parameters!");
        }
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public double calculateArea() {
        return height * width;
    }
    //endregion

    //region Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //endregion
}
