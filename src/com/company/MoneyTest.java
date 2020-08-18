package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


public class MoneyTest {
    @Test
    public void ConstructorShouldSetAmountAndCurrency() {
        Money money =new Money(10, "USD");
        Money money1 = new Money(10,"USD");
        Money money2 = new Money(20,"IR");
        assertEquals(10, money.getAmount());
        assertEquals("USD",money.getCurrency());
        assertTrue(money.equals(money));
        assertTrue(money1.equals(money));
        assertFalse(money2.equals(money));
    }
}