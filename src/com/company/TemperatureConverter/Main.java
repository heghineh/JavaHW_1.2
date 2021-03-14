package com.company.TemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("""
                Tap 1 for converting Fahrenheit to Celsius.
                Tap 2 for converting Fahrenheit to Kelvin.
                Tap 3 for converting Celsius to Fahrenheit.
                Tap 4 for converting Celsius to Kelvin.
                Tap 5 for converting Kelvin to Fahrenheit.
                Tap 6 for converting Kelvin to Celsius.
                Tap any other option to exit.\s""");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your option here ----> ");
        int option = sc.nextInt();
        switch (option) {
            case 1 -> {
                System.out.print("Enter FAHRENHEIT:  ");
                Fahrenheit fahrenheit = new Fahrenheit(sc.nextInt());
                Celsius celsius = converter.convertFahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit.getTemperature() + " F = " + celsius.getTemperature() + " C.");
            }
            case 2 -> {
                System.out.print("Enter FAHRENHEIT:  ");
                Fahrenheit fahrenheit = new Fahrenheit(sc.nextInt());
                Kelvin kelvin = converter.convertFahrenheitToKelvin(fahrenheit);
                System.out.println(fahrenheit.getTemperature() + " F = " + kelvin.getTemperature() + " K.");
            }
            case 3 -> {
                System.out.print("Enter CELSIUS:  ");
                Celsius celsius = new Celsius(sc.nextInt());
                Fahrenheit fahrenheit = converter.convertCelsiusToFahrenheit(celsius);
                System.out.println(celsius.getTemperature() + " C = " + fahrenheit.getTemperature() + " F.");
            }
            case 4 -> {
                System.out.print("Enter CELSIUS:  ");
                Celsius celsius = new Celsius(sc.nextInt());
                Kelvin kelvin = converter.convertCelsiusToKelvin(celsius);
                System.out.println(celsius.getTemperature() + " C = " + kelvin.getTemperature() + " K.");
            }
            case 5 -> {
                System.out.print("Enter KELVIN:  ");
                Kelvin kelvin = new Kelvin(sc.nextInt());
                Fahrenheit fahrenheit = converter.convertKelvinToFahrenheit(kelvin);
                System.out.println(kelvin.getTemperature() + " K = " + fahrenheit.getTemperature() + " F.");
            }
            case 6 -> {
                System.out.print("Enter KELVIN:  ");
                Kelvin kelvin = new Kelvin(sc.nextInt());
                Celsius celsius = converter.convertKelvinToCelsius(kelvin);
                System.out.println(kelvin.getTemperature() + " K = " + celsius.getTemperature() + " C.");
            }
            default -> System.out.println("EXIT.");
        }
    }
}