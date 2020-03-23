package org.fasttrackit.Calculations;

import java.util.Scanner;

public class PizzaParty {

    // inca nu e rezolvat complet exercitiu, te rog nu il corecta pe acesta inca :)

    public static void main(String[] args) {

        System.out.println("How many people? ");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = scanner.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = scanner.nextInt();

        System.out.println(people + " people with " + pizzas + " pizzas");

        int totalSlices = pizzas * slices;
        int slicesPerPerson = totalSlices / people;
        int leftover = totalSlices % people;

        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");

        }
}
