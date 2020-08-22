package com.company;

import com.company.Temperatures.FahrenheitCelsiusConverter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelsiusConverterTest {
    public static final Object[] getTemperatures(){
        return $(
                $(32,0),
                $(98,37),
                $(212,100)
        );
    }
    @Before
    public void setUp(){

    }
    @Test
    @Parameters(method = "getTemperatures")
    public void ShouldConvertCelsiusToFahrenheit(int Fahrenheit,int Celsius){
        assertEquals(Fahrenheit, FahrenheitCelsiusConverter.toFahrenheit(Celsius));
    }
    @Test
    @Parameters(method = "getTemperatures")
    public void ShouldConvertFahrenheitToCelsius(int Celsius,int Fahrenheit){
        assertEquals(Fahrenheit, FahrenheitCelsiusConverter.toCelsius(Celsius));
    }
}
