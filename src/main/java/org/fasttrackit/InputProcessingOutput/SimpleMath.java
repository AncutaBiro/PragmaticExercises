package org.fasttrackit.InputProcessingOutput;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        // exercitiu cerea sa stocam variabile de tip string pe care sa le transformam in int ca se putem face operatiile.
        // pentru economie de spatiu si timp, am aplicat scanner.nextInt
        // nu am creat metode pt operatii matematice ci doar variabile care sa retina rezultatul.
        // am aplicat metode matematice in tema cu BasicMathOperators

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
