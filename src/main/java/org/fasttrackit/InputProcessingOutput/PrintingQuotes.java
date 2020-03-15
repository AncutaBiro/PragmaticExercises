package org.fasttrackit.InputProcessingOutput;

import java.util.Scanner;

public class PrintingQuotes {

    public static void main(String[]args) {

        System.out.println("What is the quote?");

        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();

        System.out.println("Who said it?");

        String author = scanner.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");

    }

}
