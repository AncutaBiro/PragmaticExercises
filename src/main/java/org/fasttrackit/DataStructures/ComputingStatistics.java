package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComputingStatistics {

    static List<Integer> numbers = new ArrayList<>();
    static List<Double> squareDiffFromAverage = new ArrayList<>();
    static int sum =0;
    static double sumSquareDiff = 0;
    static Integer max = Integer.MIN_VALUE;
    static Integer min = Integer.MAX_VALUE;

    private static List<Integer> getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        while (scanner.hasNextInt()) {
            System.out.print("Enter a number: ");
            Integer inputNumbers = scanner.nextInt();
            numbers.add(inputNumbers);
        }
        scanner.nextLine();
        String nonNumericValue = scanner.nextLine();
        if (nonNumericValue.equalsIgnoreCase("done")) {
            System.out.println("Numbers: " + numbers);
            } else if (nonNumericValue.matches("[a-zA-Z]+")) {
            System.out.println("Please enter a number or \"done\" to complete the program.");
            return getNumbers();
        }
        return numbers;
    }

    public static void main(String[] args) {
        getNumbers();

        for (Integer number : numbers) {
            sum = sum + number;
        }
        int average = sum/numbers.size();
        System.out.println("The average is " + average);

        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The minimum is " + min);

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The maximum is " + max);

        for (Integer number : numbers) {
            double squareDiff = (Math.pow((number-average), 2));
            squareDiffFromAverage.add(squareDiff);
        }

        for (Double numberD: squareDiffFromAverage) {
            sumSquareDiff = sumSquareDiff + numberD;
        }

        double averageSquareValues = sumSquareDiff/numbers.size();
        double standardDev = (Math.sqrt(averageSquareValues));

        BigDecimal s =  new BigDecimal(standardDev);
        BigDecimal standardDeviation = s.setScale(2, RoundingMode.HALF_UP);

//      nu inteleg de ce nu imi da rezultatul din ex. imi scapa ceva? ma poti ajuta, te tog?
        System.out.println("The standard deviation is " + standardDeviation);
        }

    }

