package org.fasttrackit.Calculations;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class SelfCheckout {

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

        double tax = 5.5 * subTotal / 100;

        System.out.println("Tax: "+ dollar.getSymbol() + tax);

        double total = subTotal + tax;

        System.out.println("Total: "+ dollar.getSymbol() + total);

    }
}
