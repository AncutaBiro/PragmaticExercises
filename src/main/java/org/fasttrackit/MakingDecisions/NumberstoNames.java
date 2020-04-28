package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;

public class NumberstoNames {

    public static void main(String[] args)  {
        numbersToNamesAndInputCheck ();
    }

    private static void numbersToNamesAndInputCheck() {

        System.out.println("Please enter the number of the month: ");
        int month = ScannerUtils.nextInt();

        switch(month) {
            case 1:
                System.out.println("The name of the month is January");
                break;
            case 2:
                System.out.println("The name of the month is February");
                break;
            case 3:
                System.out.println("The name of the month is March");
                break;
            case 4:
                System.out.println("The name of the month is April");
                break;
            case 5:
                System.out.println("The name of the month is May");
                break;
            case 6:
                System.out.println("The name of the month is June");
                break;
            case 7:
                System.out.println("The name of the month is July");
                break;
            case 8:
                System.out.println("The name of the month is August");
                break;
            case 9:
                System.out.println("The name of the month is September");
                break;
            case 10:
                System.out.println("The name of the month is October");
                break;
            case 11:
                System.out.println("The name of the month is November");
                break;
            case 12:
                System.out.println("The name of the month is December");
                break;
            default:
                System.out.println("You have entered an invalid value. Try again with a number between 1-12.");
                numbersToNamesAndInputCheck();
        }
    }
}
