package com.company.CurrencyConverter;
//convert(Dram from, Ruble to)
//        convert(Dram from, Dollar to)
//        convert(Dollar from, Ruble to)
//        convert(Dollar from, Dram to)
//        convert(Ruble from, Dram to)
//        convert(Ruble from, Dollar to)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("""
                Tap 1 for converting Dram to Ruble.
                Tap 2 for converting Dram to Dollar.
                Tap 3 for converting Dollar to Ruble.
                Tap 4 for converting Dollar to Dram.
                Tap 5 for converting Ruble to Dram.
                Tap 6 for converting Ruble to Dollar.
                Tap any other option to exit.\s""");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your option here ----> ");
        int option = sc.nextInt();
        switch (option) {
            case 1 -> {
                System.out.print("Enter DRAM:  ");
                Dram dram = new Dram(sc.nextInt());
                Ruble ruble = converter.convertDramToRuble(dram);
                System.out.println(dram.getCurrency() + " AMD = " + ruble.getCurrency() + " RUB.");
            }
            case 2 -> {
                System.out.print("Enter DRAM:  ");
                Dram dram = new Dram(sc.nextInt());
                Dollar dollar = converter.convertDramToDollar(dram);
                System.out.println(dram.getCurrency() + " AMD = " + dollar.getCurrency() + " USD.");
            }
            case 3 -> {
                System.out.print("Enter DOLLAR:  ");
                Dollar dollar = new Dollar(sc.nextInt());
                Ruble ruble = converter.convertDollarToRuble(dollar);
                System.out.println(dollar.getCurrency() + " USD = " + ruble.getCurrency() + " RUB.");
            }
            case 4 -> {
                System.out.print("Enter DOLLAR:  ");
                Dollar dollar = new Dollar(sc.nextInt());
                Dram dram = converter.convertDollarToDram(dollar);
                System.out.println(dollar.getCurrency() + " USD = " + dram.getCurrency() + " AMD.");
            }
            case 5 -> {
                System.out.print("Enter RUBLE:  ");
                Ruble ruble = new Ruble(sc.nextInt());
                Dram dram = converter.convertRubleToDram(ruble);
                System.out.println(ruble.getCurrency() + " RUB = " + dram.getCurrency() + " AMD.");
            }
            case 6 -> {
                System.out.print("Enter RUBLE:  ");
                Ruble ruble = new Ruble(sc.nextInt());
                Dollar dollar = converter.convertRubleToDollar(ruble);
                System.out.println(ruble.getCurrency() + " RUB = " + dollar.getCurrency() + " USD.");
            }
            default -> System.out.println("EXIT.");
        }
    }
}