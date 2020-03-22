package org.fasttrackit.Calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PaintCalculator {

    final static double CONVERSION_RATE = 350;

    public static void main(String[] args) {

        System.out.println("What is the length of the room in feet? ");
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();

    System.out.println("What is the width of the room in feet?");
    int width = scanner.nextInt();

    int areaFeet = length * width;

    double gallons = areaFeet / CONVERSION_RATE;

    BigDecimal gallonsNumber = new BigDecimal(gallons);
    BigDecimal gallonsWholeNumber = gallonsNumber.setScale (0, RoundingMode.CEILING);

    //  double gallonsWholeNumber = Math.ceil(gallons);

    System.out.println("You will need to purchase " + gallonsWholeNumber +" gallons of paint to cover " + areaFeet + " square feet.");

}

}
