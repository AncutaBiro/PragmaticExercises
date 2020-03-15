package org.fasttrackit.InputProcessingOutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

    public static void main(String[]args) {

        System.out.println("What is the input string?");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int length = inputString.length();

        System.out.println(inputString + " has " + length + " characters.");

//  If the user enters nothing,state that the user must enter something into the program.


    }

}
