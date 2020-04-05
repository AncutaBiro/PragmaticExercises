package org.fasttrackit.MakingDecisions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BloodAlcoholCalculator {

    final static double B_A_CONTENT = 0.08;
    final static double R_W = 0.66;
    final static double R_M = 0.73;


    public static void main(String[] args) {

        System.out.println("Please enter your weight ");
        Scanner scanner =  new Scanner(System.in);
        double w = scanner.nextDouble();

        System.out.println("Please enter the gender: male or female ");
        Scanner scanner1 = new Scanner (System.in);
        String g = scanner1.nextLine();

        System.out.println("Please enter the number of drinks ");
        double d = scanner.nextDouble();

        System.out.println("Please enter fl oz (volume) of a drink ");
        double v = scanner.nextDouble();

        System.out.println("Please enter the number of hours since the last drink ");
        double h = scanner.nextDouble();

        double a = d*v;

        if (g.equalsIgnoreCase("female")) {
            var BACW = ( a * 5.14 / w * R_W ) - 0.015 * h;
            BigDecimal x = new BigDecimal(BACW);
            BigDecimal BACWRounded = x.setScale(2,RoundingMode.HALF_UP);

            if (BACW >= B_A_CONTENT) {
                System.out.println("Your BAC is " + BACWRounded + "\nIt is NOT legal for you to drive.");
            }
            else {
                System.out.println("Your BAC is " + BACWRounded + "\nIt is legal for you to drive. Please carry on.");
            }
        }
        if (g.equalsIgnoreCase("male")) {
            double BACM = ( a  * 5.14 / w * R_M ) - 0.015 * h;
            BigDecimal x = new BigDecimal(BACM);
            BigDecimal BACMRounded = x.setScale(2,RoundingMode.HALF_UP);

            if (BACM >= B_A_CONTENT) {
                System.out.println("Your BAC is " + BACMRounded + "\nIt is NOT legal for you to drive.");
            }
            else {
                System.out.println("Your BAC is " + BACMRounded + "\nIt is legal for you to drive. Please carry on.");
            }

        }

    }

}
