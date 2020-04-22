package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;

public class NumberstoNames {

    public static void main(String[] args) {

        System.out.println("Please enter the number of the month: ");
        int month = ScannerUtils.nextInt();

//        intrebare: e posibil si daca da cum se poate "Use a single output statement for this program."
//        e vorba de switch cu 12 case, cum sa ai o singura declaratie pt rezultat? te rog, clarifica. poate nu am inteles eu bine cerinta

//      e posibil si cum sa fac un mesaj de eroare in cadrul instructiunii default cu recursivitate?
//      adica sa ii dea posibilitatea userului sa incerce din nou fara sa iasa din program.

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
                System.out.println("Please enter a number from 1-12. Try again.");
        }
    }

}
