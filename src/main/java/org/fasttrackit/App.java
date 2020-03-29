package org.fasttrackit;

import org.fasttrackit.ForLoopExercises.LogicalOp1;
import org.fasttrackit.ForLoopExercises.LogicalOp2;
import org.fasttrackit.ForLoopExercises.LogicalOp3;
import org.fasttrackit.ForLoopExercises.LogicalOp4;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        LogicalOp1 ex1 =  new LogicalOp1 ();
        ex1.op1(99);

        LogicalOp2 ex2 = new LogicalOp2();
        ex2.op2(-6);

        LogicalOp3 ex3 = new LogicalOp3();
        ex3.op3(10,20);

        LogicalOp4 ex4 = new LogicalOp4();
        ex4.op4 (1,5);

    }
}
