package org.fasttrackit.LabExercises;

/*
Given an array A (distinct numbers) of size N.
The array will be considered valid if each element satisfies the following condition:
whenever a number k from the array is lower than any number x that comes after it in the array,
all numbers following x in the array will be greater than k.
Validate the array according to this rule.
Input:
The input data set is provided as a text file with the following format:
The first line of the file contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input.
The first line contains a single integer N denoting the size of the array.
The second line contains N space-separated integers denoting the elements of the array.
Output:
Print the results in a new with the following format:
CASE #<index>: VALID
or
CASE #<index>: INVALID
Constraints:
1 <= T <= 10
1 <= N
1 <= A[i] <= 100
Example:
Input:
5
3
1 3 2
3
2 1 3
6
3 2 1 5 4 6
4
1 3 4 2
5
3 4 5 1 2

Output:
CASE #1: VALID
CASE #2: VALID
CASE #3: VALID
CASE #4: INVALID
CASE #5: INVALID
 */

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {

    public static String validateArray (int [] numbers) {
        return "VALID";
    }

    public static void main(String[] args) throws IOException {

//        BufferedReader bufferedReader = new BufferedReader(
//                new FileReader("C:\\Users\\Anca\\Desktop\\Java Curs\\Java15\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\LabExercises\\exercise 6 - input.txt"));
//
//        String line = bufferedReader.readLine();
//        to complete

        Scanner scanner =  new Scanner (Paths.get ("C:\\Users\\Anca\\Desktop\\Java Curs\\Java15\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\LabExercises\\exercise 6 - input.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\Anca\\Desktop\\Java Curs\\Java15\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\LabExercises\\exercise 6 - output.txt", true));

        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++) {
            int arrayLength = scanner.nextInt();

            int[] numbers = new int[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                numbers [j] = scanner.nextInt();

            }

            String result = validateArray(numbers);

            String resultLine = "CASE #" + i + ": " + result;

            bufferedWriter.write(resultLine);

        }

    }
}
