package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String[] args) {

        System.out.println("What is your age? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

            if (age >= 16) {
                System.out.println("You are old enough to legally drive.");
            } else {
                System.out.println("You are NOT old enough to legally drive.");
            }

            String result = (age >= 16) ? "You are old enough to legally drive." : "You are NOT old enough to legally drive.";
            System.out.println(result);
        }
    }

