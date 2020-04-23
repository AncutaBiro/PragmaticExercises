package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;

public class ComparingNumbers {

    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        int firstNo = ScannerUtils.nextInt();

        System.out.println("Enter the second number: ");
        int secondNo = ScannerUtils.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNo = ScannerUtils.nextInt();

        if (firstNo!=secondNo && secondNo !=thirdNo && thirdNo != firstNo) {

            if (firstNo > secondNo && firstNo > thirdNo) {
                System.out.println("The largest number is " + firstNo);
            } else if (secondNo > firstNo && secondNo > thirdNo) {
                System.out.println("The largest number is " + secondNo);
            } else if (thirdNo > firstNo && thirdNo > secondNo) { // de ce apare mesajul?
                System.out.println("The largest number is " + thirdNo);
            }
        }
                else {
                    System.out.println("The numbers are not distinct, please try again to enter different numbers.");
                }

    }

    }

