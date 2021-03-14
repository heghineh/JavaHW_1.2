package com.company.TemperatureConverter;

public class TemperatureConverter {
    public Celsius convertFahrenheitToCelsius(Fahrenheit fahrenheit) {
        Celsius celsius = new Celsius(5 * (fahrenheit.getTemperature() - 32) / 9);
        return celsius;
    }

    public Kelvin convertFahrenheitToKelvin(Fahrenheit fahrenheit) {
        Kelvin kelvin = new Kelvin(5 * (fahrenheit.getTemperature() + 459.67) / 9);
        return kelvin;
    }

    public Fahrenheit convertCelsiusToFahrenheit(Celsius celsius) {
        Fahrenheit fahrenheit = new Fahrenheit(9 * celsius.getTemperature() / 5 + 32);
        return fahrenheit;
    }

    public Kelvin convertCelsiusToKelvin(Celsius celsius) {
        Kelvin kelvin = new Kelvin(celsius.getTemperature() + 273.15);
        return kelvin;
    }

    public Fahrenheit convertKelvinToFahrenheit(Kelvin kelvin) {
        Fahrenheit fahrenheit = new Fahrenheit(9 * (kelvin.getTemperature()) / 5 - 459.67);
        return fahrenheit;
    }

    public Celsius convertKelvinToCelsius(Kelvin kelvin) {
        Celsius celsius = new Celsius(kelvin.getTemperature() - 273.15);
        return celsius;
    }
}