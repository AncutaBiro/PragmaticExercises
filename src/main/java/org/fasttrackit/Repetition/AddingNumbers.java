package org.fasttrackit.Repetition;

import org.fasttrackit.utils.ScannerUtils;

public class AddingNumbers {

    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Please give a number of repetitions. I will tell you the total of all the numbers entered.");

        int inputNumbers = ScannerUtils.nextInt();

        int [] number =  new int [inputNumbers];

        for (int i = 0; i < inputNumbers; i++) {
            System.out.print ((i+1) + ". Enter a number: ");
            number[i] = ScannerUtils.nextInt();
            sum = sum + number[i];
        }

        System.out.println("The total is " + sum);
    }
}
