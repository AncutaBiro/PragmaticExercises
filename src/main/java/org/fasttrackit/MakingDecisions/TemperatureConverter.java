package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        Scanner scanner1 = new Scanner(System.in);
        String a = scanner1.nextLine();
        System.out.println("Your choice:" + a);

        if (a.equalsIgnoreCase("c")) {
            System.out.println("Please enter the temperature in Fahrenheit.");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            int c = (t - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + c);
        } else if (a.equalsIgnoreCase("f")) {
            System.out.println("Please enter the temperature in Celsius.");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            int f = (t * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + f);
        }

        else {System.out.println("Please enter a valid value: C or F");}

    }
}







