package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;

public class MultistateSalesTaxCalculator {

    public static void main(String[] args) {
        double tax = 0;
        double total;

        System.out.println("What is the order amount? ");
        double order = ScannerUtils.nextDouble();

        System.out.println("What state do you live in? ");
        String state = ScannerUtils.nextLine();

        if (state.equalsIgnoreCase("Wisconsin")) {
            System.out.println("Which county? ");
            String county = ScannerUtils.nextLine();

            tax = (order * 5) / 100;

            if (county.equalsIgnoreCase("Eau Claire")) {
                tax += 0.005;
                System.out.println("The tax including additional Eau Claire county tax is " + tax);
            }
            if (county.equalsIgnoreCase("Dunn")) {
                tax += 0.004;
                System.out.println("The tax including additional Dunn county tax is " + tax);
            }

        }

        if (state.equalsIgnoreCase("Illinois")) {
            tax = (order * 8) / 100;
            System.out.println("The tax is " + tax);

        }
            total = order + tax;
            System.out.println("The total is " + total);
        }
    }



