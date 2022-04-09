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
    REFACTOR #3
    Pull Up Method
    I pulled this method up to be a constructor as
    the method before was acting as a constructor in a 
    regular method
    
    public void SubExpressionsElimination() {
        gen = new Random();
        d = gen.nextDouble();
        lim = gen.nextDouble();
        max = gen.nextDouble();
        sx = gen.nextDouble();
        sy = gen.nextDouble();
    }
 */

 
public class SubExpressionsElimination3 {

    Random gen;
    double d, lim, max, sx, sy;

    SubExpressionsElimination3() {
        gen = new Random();
        d = gen.nextDouble();
        lim = gen.nextDouble();
        max = gen.nextDouble();
        sx = gen.nextDouble();
        sy = gen.nextDouble();
    }

    public void exampleNoElimination() {
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }

    
}
