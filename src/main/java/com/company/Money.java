package com.company;


public class Money {
    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        checkLegality(amount,currency);
        this.amount = amount;
        this.currency = currency;
    }

    private void checkLegality(int amount, String currency) {
        if (amount < 0){
            throw new IllegalArgumentException("" +
                    "illegal amount [ "+amount+" ]");
        }
        if (currency==null || currency.isEmpty() ){
            throw new IllegalArgumentException("" +
                    "illegal currency [ "+currency+" ]");
        }
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
