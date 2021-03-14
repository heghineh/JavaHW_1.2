package com.company.Point;

public class Point {
    //region Properties
    private double coordinateX;
    private double coordinateY;
    //endregion

    //region Constructors
    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    //endregion

    //region Public Methods
    public double distance() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) + Math.pow(coordinateY - point.coordinateY, 2));
    }
    //endregion
    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    //region Getters and Setters

    //endregion
}
