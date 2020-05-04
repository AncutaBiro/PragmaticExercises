package org.fasttrackit.Functions;

import org.fasttrackit.utils.ScannerUtils;
import java.util.InputMismatchException;

public class ValidatingInputs {

    public static void main(String[] args) {

        System.out.println("Enter the first name:");
        checkName();

        System.out.println("Enter the last name:");
        checkName();

        System.out.println("Enter the ZIP code: ");
        checkZip();

        System.out.println("Enter an employee ID: ");
        checkEmployeeID();

    }

    private static String checkName() {
        String name = ScannerUtils.nextLine();
        char[] arrayName = name.toCharArray();

        try {
            for (int i = 0; i <= arrayName.length; i++) {

                if (name.isEmpty()) {
                    throw new NullPointerException();
                }
                if (!name.matches("[a-zA-Z]+")) {
                    throw new InputMismatchException();
                }
                if (!(arrayName.length >= 2)) {
                    throw new IndexOutOfBoundsException();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The name must be filled in.");
            return checkName();
        } catch (InputMismatchException e) {
            System.out.println("The name must contain letters. You have entered an invalid value.");
            return checkName();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(name + " is not a valid first name. It is too short.");
            return checkName();
        }
        return name;
    }

    private static int checkZip() {
        String zip = ScannerUtils.nextLine();

        if (zip.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println();
        } else {
            System.out.println("The ZIP code must be numeric.");
            return checkZip();
        }
        return Integer.parseInt(zip);
    }

    private static String checkEmployeeID() {
    String id = ScannerUtils.nextLine();
    char [] idArray = id.toCharArray();

        try {
            for (int i = 0; i < 2; i++) {
                if (!Character.isUpperCase(idArray[i])) {
                    throw new InputMismatchException();
                }
            }
            if (id.charAt(2)!='-') {
                throw new IndexOutOfBoundsException();
            }
            for (int i = 2; i < id.length(); i++) {
                if (id.length() < 7 && !Character.isDigit(idArray[i])) {
                    throw new NullPointerException();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("The first 2 digits must be upper case letters.");
            return checkEmployeeID();
        } catch (IndexOutOfBoundsException e){
            System.out.println("The 3th digit must be a hyphen: - ");
            return checkEmployeeID();
        } catch (NullPointerException e) {
            System.out.println("The last 4 digits must be numbers. ");
            return checkEmployeeID();
        }
        return id;
    }

}