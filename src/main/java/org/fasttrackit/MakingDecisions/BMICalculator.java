package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;
import java.util.InputMismatchException;

public class BMICalculator {

    final static int CONSTANT = 703;

    private static double getWeightFromUser (){
        System.out.println("Please enter the weight in pounds.");
        String weight = ScannerUtils.nextLine();

        if (weight.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println();
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
                return getWeightFromUser();
            }
            return Double.parseDouble(weight);
        }

    private static double getHeightFromUser() {
        System.out.println("Please enter the height in inches.");

        try {
            return ScannerUtils.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again.");
            return getHeightFromUser();
        }
    }

        public static void main(String[] args){

            double weight= getWeightFromUser();

            double height = getHeightFromUser();

            double bmi = (weight / (height * height)) * CONSTANT;

            if (bmi <= 18.5) {
                System.out.println("Your BMI is " + bmi + ".");
                System.out.println("You are underweight. You should see your doctor.");}
               if (bmi >= 25) {
                   System.out.println("Your BMI is " + bmi + ".");
                   System.out.println("You are overweight. You should see your doctor.");}
                    else {
                    System.out.println("Your BMI is "+ bmi + ". " );
                    System.out.println("You are within the ideal weight range." );
                }
            }

}
