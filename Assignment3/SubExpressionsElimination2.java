/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.Random; 

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */

  /*
    REFACTOR #5
    Extract Method
    I did this because the random number generation 
    warranted its own method, as well as cutting down on repeated code

    public void exampleNoElimination() {
        Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }
 */
public class SubExpressionsElimination2 {
    public void exampleNoElimination() {
        double[] rand = getRand();
        double d = rand[0];
        double lim = rand[1];
        double max = rand[2];
        double sx = rand[3];
        double sy = rand[4];
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        double[] rand = getRand();
        double d = rand[0];
        double lim = rand[1];
        double max = rand[2];
        double sx = rand[3];
        double sy = rand[4];
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }

    public double[] getRand(){

        Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();

        double[] rand = {d,lim,max,sx,sy};

        return rand;
    }
    
    
}
