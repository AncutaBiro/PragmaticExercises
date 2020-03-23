package org.fasttrackit.Calculations;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class SelfCheckout {

    final static double TAX_RATE = 5.5;
    final static int CONVERSION_PERCENTAGE = 100;

    public static void main(String[] args) {

        System.out.println("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        int price1 = scanner.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt();

        System.out.println("Enter the price of item 2: ");
        int price2 = scanner.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();

        System.out.println("Enter the price of item 3: ");
        int price3 = scanner.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();

        double subTotal = price1*quantity1 + price2*quantity2 + price3*quantity3;

        // cum se poate obtine doar simboulul $ , fara US$?

        Currency dollar = Currency.getInstance(Locale.US);

        System.out.println("Subtotal: " + dollar.getSymbol() + subTotal);

        double tax = TAX_RATE * subTotal / CONVERSION_PERCENTAGE;

        System.out.println("Tax: "+ dollar.getSymbol() + tax);

        double total = subTotal + tax;

        System.out.println("Total: "+ dollar.getSymbol() + total);

    }
}
