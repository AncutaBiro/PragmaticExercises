package org.fasttrackit.InputProcessingOutput;

import java.time.YearMonth;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[]args) {

        System.out.println("What is your current age? ");

        Scanner scanner = new Scanner(System.in);

        String age = scanner.nextLine();
        int ageInt = Integer.parseInt(age);

        System.out.println("At what age would you like to retire? ");

        String retireAge = scanner.nextLine();
        int retireAgeInt = Integer.parseInt(retireAge);

        int currentYear = YearMonth.now().getYear();

        int yearsLeftTillRetirement = retireAgeInt - ageInt;
        System.out.println("You have " + yearsLeftTillRetirement + " years left until you can retire.");

        int yearOfRetirement = currentYear + yearsLeftTillRetirement;
        System.out.println("It's " + currentYear + " , so you can retire in " + yearOfRetirement);

    }
}
