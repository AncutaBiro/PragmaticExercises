package org.fasttrackit.LabExercises;

/*
2.	For a given N, prints the sum of even and odd integers of the first N natural numbers.
Input: First line of the input contains an integer T which denotes the number of test cases.
Then T test cases follow.  Each test case contains a single line containing N.
Output:  For each test case, print space separated sums of even and odd integers of the first N natural numbers respectively.
Constraints:
1 <= T <= 200
1 <= N <= 10000
Example:
Input:
2
1
6
Output:
0 1
12 9
Exercise source: geeksforgeeks.org
 */

import java.util.Scanner;

public class OddAndEvenNumbersSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCasesCount = scanner.nextInt();

        int[] maxNumbers = new int[testCasesCount];

        for (int i = 0; i < testCasesCount; i++) {
            maxNumbers[i] = scanner.nextInt();
        }

        for (int number : maxNumbers) {
            int oddSum = 0;
            int evenSum = 0;

            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    evenSum = evenSum + i;
                } else {
                    oddSum = oddSum + i;
                }
            }
            System.out.println(evenSum + " " + oddSum);
        }
    }
}
