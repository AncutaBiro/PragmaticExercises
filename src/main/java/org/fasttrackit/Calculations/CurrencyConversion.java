package org.fasttrackit.Calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CurrencyConversion {

    final static int CONVERSION_RATE_TO = 100;

    public static void main(String[] args) {

        System.out.println("How many euros are you exchanging? ");
        Scanner scanner = new Scanner(System.in);
        int amountEur = scanner.nextInt();

        System.out.println("What is the exchange rate? ");
        double exchangeEur = scanner.nextDouble();

        double amountUsd = amountEur * exchangeEur / CONVERSION_RATE_TO;

        BigDecimal a = new BigDecimal(amountUsd);
        BigDecimal amountUsdRounded = a.setScale (2, RoundingMode.HALF_UP);

        System.out.println(amountEur + " euros at an exchange rate of " + exchangeEur + " is " + amountUsdRounded + " US dollars.");









    }

}
