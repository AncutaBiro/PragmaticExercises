package org.fasttrackit.Repetition;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class HandlingBadInput {

    public static void main(String[] args) {
        int r = inputValidator();
        int years = 72 / r;
                System.out.println("It will take " + years + " years to double your initial investment. ");
    }

    private static int inputValidator() {

        System.out.println("What is the rate of return?");
        String r = ScannerUtils.nextLine();

        List<String> inputs = new ArrayList<>();
        inputs.add(r);

        try {
        for (String i : inputs) {
            if (i.equals("0")) {
                throw new ArithmeticException();
            }
            if (i.matches("[a-zA-Z]+")) {
                throw new InputMismatchException();
            }
            }
        } catch (ArithmeticException e) {
            System.out.println("The value \"0\" is not valid.");
            return inputValidator();
        } catch (InputMismatchException e) {
            System.out.println("Sorry. That's not a valid input.");
            return inputValidator();
        }
        return Integer.parseInt(r);
    }

}

