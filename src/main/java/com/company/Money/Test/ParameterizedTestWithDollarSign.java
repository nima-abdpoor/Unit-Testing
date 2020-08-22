package com.company.Money.Test;

import com.company.Money.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTestWithDollarSign {
    private static final Object[] getMoney(){
        return $(
                $(10,"USD"),
                $(20,"EUD")
        );
    }
    @Test
    @Parameters(method = "getMoney")
    public void ConstructorShouldSetAmountAndCurrency(int amount, String currency){
        Money money =new Money(amount,currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }

}
