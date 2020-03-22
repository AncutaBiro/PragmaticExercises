package org.fasttrackit.Calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AreaOfARectangularRoom {

    final static double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {

        System.out.println("What is the length of the room in feet? ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = scanner.nextInt();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int areaFeet = length * width;
        double areaMeters = areaFeet * CONVERSION_FACTOR;

        BigDecimal area = new BigDecimal(areaMeters);
        BigDecimal areaMetersRounded = area.setScale (3,RoundingMode.HALF_UP);

        System.out.println("The area is ");
        System.out.println(areaFeet +" square feet");
        System.out.println(areaMetersRounded +" square meters");

    }

}
