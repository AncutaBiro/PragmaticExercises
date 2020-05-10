package org.fasttrackit.Repetition;

import org.fasttrackit.utils.ScannerUtils;

import java.util.InputMismatchException;

public class KarvonenHeartRate {

    public static void main(String[] args) {

        System.out.print("Resting pulse: ");
        int restingHR = inputValidator();

        System.out.print("Age: ");
        int age = inputValidator();

        System.out.println();

        System.out.println("Intensity | Rate");
        System.out.println("_ _ _ _ _ _ _ _ _ _");

        for (int i = 55; i <= 95; i+=5) {
            int tHR = (((220 - age) - restingHR) * i/100) + restingHR;
            System.out.println(i + "%" + "       | " + tHR + " bpm");
            }
        }

    private static int inputValidator (){
        String input = ScannerUtils.nextLine();
        try {
            if (input.matches("[a-zA-Z]+")) {
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Sorry. That's not a valid input.");
            return inputValidator();
        } return Integer.parseInt(input);
    }

}
