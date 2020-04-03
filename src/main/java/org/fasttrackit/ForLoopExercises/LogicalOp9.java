package org.fasttrackit.ForLoopExercises;

public class LogicalOp9 {

    public void op9() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print ("*");
            }
                System.out.println(" ");
        }
    }
}