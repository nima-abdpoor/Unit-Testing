package com.company.Test;

import com.company.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {
    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    private static final Object[] getInvalidAmount(){
        return new Object[] []{ {-1250},{-1} ,{-5}};
    }
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidAmount")
    public void ConstructorShouldThrowIAEForInvalidAmount(int invalidAmount){
        new Money(invalidAmount,VALID_CURRENCY);
    }

    private static final Object[] getInvalidCurrency(){
        return new Object[] []{ {""} , {null}};
    }
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void ConstructorShouldThrowIAEForInvalidCurrency(String invalidCurrency){
        new Money(VALID_AMOUNT,invalidCurrency);
    }
}
