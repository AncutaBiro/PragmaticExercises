package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;
import java.util.Random;

public class Magic8Ball {

    public static void main(String[] args) {

        String[] responses = new String[4];

        responses[0] = "Yes";
        responses[1] = "No";
        responses[2] = "Maybe";
        responses[3] = "Ask again later";

            System.out.println("What's your question?");
            String input = ScannerUtils.nextLine();

            if (input.matches(("-?\\d+(\\.\\d+)?"))) {
                System.out.println("Please enter a valid question."); }
                else {
                int rndResponse = new Random().nextInt(responses.length);
                System.out.println(responses[rndResponse]); }
            }

    }





