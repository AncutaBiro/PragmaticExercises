package org.fasttrackit.Functions;

import org.fasttrackit.utils.ScannerUtils;

public class MonthsToPayOffACreditCard {

    public static void main(String[] args) {
        System.out.println("It will take you " + calculateMonthsUntilPaidOff() + " months to pay off this card.");
    }

//   te rog sa ma ajuti, am incercat in toate modurile si nu calculeaza corect.
    private static int calculateMonthsUntilPaidOff () {

        System.out.println("What is your balance?");
        double b = ScannerUtils.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double aprPercentage = ScannerUtils.nextInt();

//        care este formula corecta pt a calcula i?
        double i = (aprPercentage / 100 ) / 365 ;
//        double i = aprPercentage / 365;
//        double i = b * (aprPercentage / 365) / 100;
        System.out.println(i);

        System.out.println("What is the monthly payment you can make?");
        double p = ScannerUtils.nextDouble();

        double dividend = Math.log( 1 + (b/p) * (1 - Math.pow((1+i),30)));
        System.out.println(dividend);

        double divisor = Math.log(1+i);
        System.out.println(divisor);

//        cum se calculeaza -1/30 ca sa dea -0.33?
//        double firstTerm = Math.floor( (double) - 1 / 30 );
//        System.out.println(firstTerm);

        double nDouble = -0.33 * dividend/divisor;

        return (int)Math.round(nDouble);
    }
}
