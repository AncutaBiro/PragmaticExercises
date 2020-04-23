package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;
import java.util.InputMismatchException;

public class BMICalculator {

    final static int CONSTANT = 703;

    // am incercat o metoda care sa verifice daca inputul de la user este numeric,
// problema este ca la apelarea metodei returneaza date de tip String si nu pot aplica formula are nevoie de variabile numerice.
//    private static String getWeightFromUser (){
//        System.out.println("Please enter the weight in pounds.");
//        String weight = ScannerUtils.nextLine();
//
//        if (weight.matches("-?\\d+(\\.\\d+)?")) {
//            System.out.println();
//            } else {
//                System.out.println("You have entered an invalid value. Please try again.");
//                return getWeightFromUser();
//            }
//            return weight;
//        }

//    am incercat try catch cu recurvitate sa verific datele , dar nu functioneaza. Poti sa ma ajuti, te rog.
//    private static double getWeightFromUser() {
//        System.out.println("Please enter the weight in pounds.");
//        double weight = ScannerUtils.nextDouble();
//
//        try {
//            return weight;
//        } catch (InputMismatchException e) {
//            System.out.println("You have entered an invalid value. Please try again.");
//            return getWeightFromUser();
//        }
//    }
//
//    private static double getHeightFromUser() {
//        System.out.println("Please enter the height in inches.");
//        double height = ScannerUtils.nextDouble();
//
//        try {
//            return height;
//        } catch (InputMismatchException e) {
//            System.out.println("You have entered an invalid value. Please try again.");
//            return getHeightFromUser();
//        }
//    }

        public static void main(String[] args){
            System.out.println("Please enter the weight in pounds.");
            double weight = ScannerUtils.nextDouble();

            System.out.println("Please enter the height in inches.");
            double height = ScannerUtils.nextDouble();

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
