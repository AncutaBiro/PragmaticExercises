package org.fasttrackit.ForLoopExercises;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp7 {
    int b;
    int c;

    public void op7 (int b) {

        for (int i = b; i < (100+i); i++) {
            if (b < 100) {
                c = c + i;
                b++;
            }
        }
        System.out.println(c);
    }
}