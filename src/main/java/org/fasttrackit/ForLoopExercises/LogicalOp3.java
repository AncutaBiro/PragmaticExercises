package org.fasttrackit.ForLoopExercises;

public class LogicalOp3 {
    int x;
    int y;

    public void op3 (int x, int y) {
        for (int i = x; i < (y+1); i++) {
            if (x <= y) {
                System.out.println(x);
                x++;
            }
        }
    }
}
