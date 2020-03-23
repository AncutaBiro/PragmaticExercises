package org.fasttrackit.Calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    final static int CONVERSION_PERCENTAGE = 100;

    public static void main(String[] args) {

        System.out.println("What is the principal amount? ");
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();

        System.out.println("What is the rate? ");
        double r = scanner.nextDouble();

        System.out.println("What is the number of years? ");
        int t = scanner.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        int n = scanner.nextInt();

        double rPerN = (r/CONVERSION_PERCENTAGE) / n;
        double compoundInterest = p * Math.pow (1+rPerN, n*t);

        BigDecimal a = new BigDecimal(compoundInterest);
        BigDecimal compoundInterestRounded = a.setScale(2, RoundingMode.HALF_UP);

        Currency dollar = Currency.getInstance(Locale.US);

        System.out.println(dollar.getSymbol() + p + " invested at " + r + "% for " + t + " years compounded "
                        + n + " times per year is " + dollar.getSymbol()+ compoundInterestRounded);

    }
}

