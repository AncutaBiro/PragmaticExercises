package org.fasttrackit.DataStructures;

import org.fasttrackit.utils.ScannerUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner
                (Paths.get("C:\\Users\\Anca\\Desktop\\Java Curs\\Java15\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\DataStructures\\EmployeeList.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter
                (new FileWriter("C:\\Users\\Anca\\Desktop\\Java Curs\\Java15\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\DataStructures\\EmployeeList.txt", true));

        List<String> employeeList1 = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            employeeList1.add(line);
        }
        System.out.println("There are " + employeeList1.size() + " employees: ");
        for (int i = 0; i < employeeList1.size(); i++) {
            System.out.println((i+1) + ". " + employeeList1.get(i));
        }

        System.out.print("\nEnter an employee name to remove: ");
        String removeName = ScannerUtils.nextLine();

        for (int i = 0; i < employeeList1.size(); i++) {
            if (removeName.equalsIgnoreCase(employeeList1.get(i))) {
                employeeList1.remove(i);
            }
        }

        System.out.println("\nThere are " + employeeList1.size() + " employees: ");
        for (int i = 0; i < employeeList1.size(); i++) {
            System.out.println((i+1) + ". " + employeeList1.get(i));
            bufferedWriter.newLine();
            bufferedWriter.write(employeeList1.get(i));
        }
        scanner.close();
        bufferedWriter.close();
    }

}






