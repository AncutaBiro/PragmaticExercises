package org.fasttrackit.Calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class ComputingSimpleInterest {

    final static int CONVERSION_PERCENTAGE = 100;

    public static void main(String[] args) {

        System.out.println("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        double rt = rate * years / CONVERSION_PERCENTAGE;
        double simpleInterest = principal * (1+rt);

        BigDecimal a = new BigDecimal(simpleInterest);
        BigDecimal simpleInterestRounded = a.setScale(2, RoundingMode.HALF_UP);

        Currency dollar = Currency.getInstance(Locale.US);

        System.out.println("After " + years + " years at " + rate + "%" + ", the investment will be worth " +
                dollar.getSymbol() + simpleInterestRounded);

    }
}
