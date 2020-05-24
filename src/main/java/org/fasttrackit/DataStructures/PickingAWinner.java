package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PickingAWinner {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        System.out.print("Enter a name: ");
        String inputNames = ScannerUtils.nextLine();
        names.add(inputNames);

        while (!inputNames.equals("")) {
            System.out.print("Enter a name: ");
            inputNames = ScannerUtils.nextLine();
            if (!inputNames.equals("")) {
            names.add(inputNames);}
        }

        System.out.println(names);

        int randomInput = new Random().nextInt(names.size());
        System.out.println("The winner is..." + names.get(randomInput));

    }
}