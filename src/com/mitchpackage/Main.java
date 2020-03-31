package com.mitchpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate:");
        float yearlyInterestRate = scanner.nextFloat();

        float yearlyInterestRateAsPercent = yearlyInterestRate/100;

        float monthlyInterestRate = yearlyInterestRateAsPercent/12;

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (Years):");
        byte years = scanner.nextByte();

        int months = (years * 12);

        double mortgageResult = 0;
        mortgageResult = (principal*((monthlyInterestRate*(Math.pow(1 + monthlyInterestRate, months)))/((Math.pow(1 + monthlyInterestRate, months))-1)));


        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        String mortgageInDollars = mortgage.format(mortgageResult);


        System.out.println ("Mortgage: " + mortgageInDollars);


    }
}
