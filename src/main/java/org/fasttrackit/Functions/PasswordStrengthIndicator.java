package org.fasttrackit.Functions;

import org.fasttrackit.utils.ScannerUtils;

public class PasswordStrengthIndicator {

    public static void main(String[] args) {

        System.out.println("Please enter the password");
        String password = ScannerUtils.nextLine();

        if (passwordValidator(password) == 1) {
            System.out.println("The password " + password + " is a very weak password.");
        }
        if (passwordValidator(password) == 2) {
            System.out.println("The password " + password + " is a weak password.");
        }
        if (passwordValidator(password) == 3) {
            System.out.println("The password " + password + " is a strong password.");}

        if (passwordValidator(password) == 4) {
                System.out.println("The password " + password + " is a very strong password.");

        }
    }

        public static int passwordValidator (String password) {

            int passValidator = 0;
            char[] passArray = password.toCharArray();
            String specialCharacters = "(?=.*[~!@#$%^&*()_]).*";


            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(passArray[i]) && password.length() < 8) {
                    passValidator = 1;
                }
                if (Character.isLetter(passArray[i]) && password.length() < 8) {
                    passValidator = 2;
                }
                if (Character.isLetterOrDigit(passArray[i]) && password.length() >= 8) {
                    passValidator = 3;
                }
                if (password.length() >= 8 && password.matches(specialCharacters) && Character.isLetterOrDigit(passArray[i])) {
                    passValidator = 4;
                }

            }
            return passValidator;
        }

    }
