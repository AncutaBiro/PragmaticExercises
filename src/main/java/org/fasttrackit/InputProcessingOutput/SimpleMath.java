package org.fasttrackit.InputProcessingOutput;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        System.out.println("What is the first number? ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("What is the second number? ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);

        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

    }
}
