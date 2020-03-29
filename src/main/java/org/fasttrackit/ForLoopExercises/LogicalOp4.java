package org.fasttrackit.ForLoopExercises;

public class LogicalOp4 {
    int x;
    int y;

    public void op4 (int x, int y) {
        if (x <= y) {
        for (int i = x; i < (y+1); i++) {
            { System.out.println(x);
                x++;
            }
        }

    } else {
            for (int i = y; i < (x+1); i++) {
                { System.out.println(y);
                    y++;
                }
            }
        }
    }
}
