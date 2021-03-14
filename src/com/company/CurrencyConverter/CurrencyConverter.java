package com.company.CurrencyConverter;

public class CurrencyConverter {
    public Ruble convertDramToRuble(Dram dram) {
        return new Ruble(dram.getCurrency() * 0.15);
    }

    public Dollar convertDramToDollar(Dram dram) {
        return new Dollar(dram.getCurrency() * 0.0021);
    }

    public Ruble convertDollarToRuble(Dollar dollar) {
        return new Ruble(dollar.getCurrency() * 73.26);
    }

    public Dram convertDollarToDram(Dollar dollar) {
        return new Dram(dollar.getCurrency() * 526.63);
    }

    public Dram convertRubleToDram(Ruble ruble) {
        return new Dram(ruble.getCurrency() * 7.19);
    }

    public Dollar convertRubleToDollar(Ruble ruble) {
        return new Dollar(ruble.getCurrency() * 0.014);
    }
}