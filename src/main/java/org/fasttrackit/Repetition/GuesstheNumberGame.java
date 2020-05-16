package org.fasttrackit.Repetition;

import org.fasttrackit.utils.ScannerUtils;

import java.util.InputMismatchException;
import java.util.Random;

public class GuesstheNumberGame {

    private static int invalidInput = 0;
    private static int wrongInput = 0;
    private static int random10 = randomNumber(10);
    private static int random100 = randomNumber(100);
    private static int random1000 = randomNumber(1000);

    public static void main (String[] args) {
        choseLevel();
    }

    private static int validateInput() {
        String input = ScannerUtils.nextLine();
        if (input.matches("[a-zA-Z]+")) {
            System.out.println("You must enter a number, please try again.");
            invalidInput++;
            return validateInput();
        }
        return Integer.parseInt(input);
    }

    private static int randomNumber(int max) { // uneori am primit 0 ca si random, desi nu ar trebui. oare de ce?
        Random r = new Random();
        return r.nextInt((max - 1 + 1) + 1);
    }

    private static int guessTheNumber10() {
        int guess = validateInput();

        if (random10 > guess) {
            System.out.println("Too low. Guess again: ");
            wrongInput++;
            return guessTheNumber10();
        }
        if (random10 < guess) {
            System.out.println("Too high. Guess again: ");
            wrongInput++;
            return guessTheNumber10();
        }
        return guess;
    }

    private static int guessTheNumber100() {
       int guess = validateInput();

        if (random100 > guess) {
           System.out.println("Too low. Guess again: ");
           wrongInput++;
          return guessTheNumber100();
     }
     if (random100 < guess) {
            System.out.println("Too high. Guess again: ");
            wrongInput++;
            return guessTheNumber100();
        }
        return guess;
   }

    private static int guessTheNumber1000() {
        int guess = validateInput();

        if (random1000 > guess) {
            System.out.println("Too low. Guess again: ");
            wrongInput++;
            return guessTheNumber1000();
        }
        if (random1000 < guess) {
            System.out.println("Too high. Guess again: ");
            wrongInput++;
            return guessTheNumber1000();
        }
        return guess;
    }

        private static void choseLevel () {

            random10 = randomNumber(10);
            random100 = randomNumber(100);
            random1000 = randomNumber(1000);
            invalidInput = 0;
            wrongInput = 0;

            System.out.println("\nLet's play Guess the Number.");

            System.out.print("Pick a difficulty level (1, 2, or 3): ");
            int level = ScannerUtils.nextInt();

            System.out.print("\nI have my number. What's your guess? ");

            if (level == 1) {
                System.out.println("Cheat " + random10);
                int guess1 = guessTheNumber10();
                System.out.println("Right, " + guess1 + " is the correct number!");
            }

            if (level == 2) {
                System.out.println("Cheat " + random100);
                int guess2 = guessTheNumber100();
                System.out.println("Right, " + guess2 + " is the correct number!");
            }

            if (level == 3) {
                System.out.println("Cheat " + random1000);
                int guess3 = guessTheNumber1000();
                System.out.println("Right, " + guess3 + " is the correct number!");
            }

            if (level!=1 && level!=2 && level!=3) {
            throw new InputMismatchException("You must enter 1,2 or 3. Try again!");
            }

            System.out.println("You got it in " + (wrongInput + invalidInput) + " guesses!");

                    System.out.println("\nPlay again: y or n");
                    String response = ScannerUtils.nextLine();

                    if (response.equals("y")) {
                        System.out.println("Great, best of luck!");
                        choseLevel();
                    }
                    if (response.equals("n")) {
                        System.out.println("Goodbye!");
                    }

    }

}







