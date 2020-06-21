package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringValues {


    public static void main(String[] args) {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = ScannerUtils.nextLine();

        int[] inputNumber = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("The even numbers are " + filterEvenNumbers(inputNumber));
    }

    private static String filterEvenNumbers(int[] inputNumbers) {

        List<String> evenNumbersList = new ArrayList<>();

        for (int inputNumber : inputNumbers) {
            if (inputNumber % 2 == 0) {
                evenNumbersList.add(Integer.toString(inputNumber));
            }
        }
        return String.join(" ", evenNumbersList);
    }

}
