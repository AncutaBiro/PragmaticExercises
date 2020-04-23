package org.fasttrackit.MakingDecisions;

import org.fasttrackit.utils.ScannerUtils;

public class TroubleshootingCarIssues {

    public static void main(String[] args) {

        System.out.println("Is the car silent when you turn the key?");
        String a = ScannerUtils.nextLine();

        if (a.equalsIgnoreCase("Y")) {
            System.out.println("Are the battery terminals corroded?");
            String b = ScannerUtils.nextLine();

            if (b.equalsIgnoreCase("Y")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (b.equalsIgnoreCase("N")) {
                System.out.println("Replace cables and try again.");
            }

        } else if (a.equalsIgnoreCase("N")){
                System.out.println("Does the car make a clicking noise?");
                String c = ScannerUtils.nextLine();

                if (c.equalsIgnoreCase("Y")) {
                    System.out.println("Replace the battery.");
                }
                    else if (c.equalsIgnoreCase("N")) {
                    System.out.println("Does the car crank up but fail to start?");
                    String d = ScannerUtils.nextLine();

                    if (d.equalsIgnoreCase("Y")){
                        System.out.println("Check spark plug connections.");
                    }
                    else if  (d.equalsIgnoreCase("N")){
                        System.out.println("Does the engine start and then die?");
                        String e = ScannerUtils.nextLine();

                        if (e.equalsIgnoreCase("Y")){
                            System.out.println("Does your car have fuel injection?");
                            String f = ScannerUtils.nextLine();

                            if (f.equalsIgnoreCase("N")) {
                                System.out.println("Check to ensure the choke is opening and closing.");
                            } else if (f.equalsIgnoreCase("Y")) {
                                System.out.println("Get it in for service.");
                            }
                        }
                    }
                }
            }
        else System.out.println("Please enter Y or N.");


        }

    }

