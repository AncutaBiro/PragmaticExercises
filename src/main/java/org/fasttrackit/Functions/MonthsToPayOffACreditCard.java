package org.fasttrackit.Functions;

import org.fasttrackit.utils.ScannerUtils;

public class MonthsToPayOffACreditCard {

    public static void main(String[] args) {
        System.out.println("It will take you " + calculateMonthsUntilPaidOff() + " months to pay off this card.");
    }

    private static double calculateMonthsUntilPaidOff () {

        System.out.println("What is your balance?");
        double b = ScannerUtils.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double aprPercentage = ScannerUtils.nextInt();

        double i = (aprPercentage / 100 ) / 365 ;
        System.out.println(i);

        System.out.println("What is the monthly payment you can make?");
        double p = ScannerUtils.nextDouble();

        double dividend = Math.log( 1 + (b/p) * (1 - Math.pow((1+i),30)));
        System.out.println(dividend);

        double divisor = Math.log(1+i);
        System.out.println(divisor);

        double n;
        n = Math.ceil(-(1/30.00) * (dividend/divisor));

        return n;
    }
}
