package com.company.Money.Test;

import com.company.Money.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
    private static final Object[] getMoney(){
        return new Object[] {
          new Object[] {10,"USD"} ,
          new Object[] {20,"EUR"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void ConstructorShouldSetAmountAndCurrency(int amount, String currency){
        Money money =new Money(amount,currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
}