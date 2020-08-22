package com.company.Temperatures;

public class FahrenheitCelsiusConverter {
    public static int toFahrenheit(int celsius) {
        return (int)(celsius*1.8)+32;
    }

    public static int toCelsius(int Fahrenheit) {
        return ((Fahrenheit-32)*5)/9 ;
    }
}
