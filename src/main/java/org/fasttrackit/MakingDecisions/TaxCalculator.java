package org.fasttrackit.MakingDecisions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        System.out.println("What is the order amount? ");
        Scanner scanner =  new Scanner(System.in);
        double orderAmount = scanner.nextDouble();

        System.out.println("What is the state? ");
        Scanner scanner1 = new Scanner (System.in);
        String theState = scanner1.nextLine();

        double tax = orderAmount * 5.5 / 100;
        double total = orderAmount + tax;

        BigDecimal a = new BigDecimal(orderAmount);
        BigDecimal orderAmount2Decimals = a.setScale(2, RoundingMode.HALF_UP);
        BigDecimal b = new BigDecimal(tax);
        BigDecimal tax2Decimals = b.setScale(2, RoundingMode.HALF_UP);
        BigDecimal c = new BigDecimal(total);
        BigDecimal total2Decimals = c.setScale(2, RoundingMode.HALF_UP);

        if (theState.equalsIgnoreCase("WI")) {
            System.out.println("The subtotal is " + orderAmount2Decimals + "\nThe tax is " +
                    tax2Decimals + "\nThe total is " + total2Decimals );
        }
        if (!theState.equalsIgnoreCase("WI")) {
        System.out.println("The total is " + orderAmount2Decimals); }
    }
}
