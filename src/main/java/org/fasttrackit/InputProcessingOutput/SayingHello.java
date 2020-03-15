package org.fasttrackit.InputProcessingOutput;

import java.util.Scanner;

public class SayingHello {

    public static void main(String[]args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + ", nice to meet you!");


//    Write a new version of the program without using any variables.
        System.out.println("What is your name?");
        System.out.println("Hello, " + scanner.nextLine() + ", nice to meet you!");

    }

}
