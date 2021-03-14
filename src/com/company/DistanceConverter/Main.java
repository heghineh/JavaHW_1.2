package com.company.DistanceConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistanceConverter converter = new DistanceConverter();

        System.out.println("""
                Tap 1 for converting Meters to Miles.
                Tap 2 for converting Miles to Meters.
                Tap any other option to exit.\s""");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your option here ----> ");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> {
                System.out.print("Enter METERS:  ");
                Meters meters = new Meters(sc.nextInt());
                Miles miles = converter.convertMetersToMiles(meters);
                System.out.println(meters.getDistance() + " Meters = " + miles.getDistance() + " Miles.");
            }
            case 2 -> {
                System.out.print("Enter MILES:  ");
                Miles miles = new Miles(sc.nextInt());
                Meters meters = converter.convertMilesToMeters(miles);
                System.out.println(miles.getDistance() + " Miles = " + meters.getDistance() + " Meters.");
            }
            default -> System.out.println("EXIT.");
        }
    }
}