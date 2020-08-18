package com.company;

import java.util.Objects;

public class Money {
    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Money){
            Money money = (Money) o;
            return money.getCurrency().equals(getCurrency())
                    && getAmount() == money.getAmount();
        }
        return false;
    }
}
