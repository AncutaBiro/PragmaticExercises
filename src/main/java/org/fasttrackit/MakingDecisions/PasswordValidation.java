package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println("What is the username? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What is the password? ");
        String password = scanner.nextLine();

        String correctPassword = "abc$123";

        if (password.equals(correctPassword)) {
            System.out.println("Welcome " + userName + "!" );}
            else {
                System.out.println("I don't know you.");
            }

        }

    }

