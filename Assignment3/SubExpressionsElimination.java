/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */

 /*
    REFACTOR #4
    Extract Variable 
    I did this because the code was repeated,
    so I made thme class variable to reduce repetition

    public void exampleNoElimination() { 
        double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }
 */

public class SubExpressionsElimination {

    double d = 1.112;
    double lim = 2.234;
    double max = 3.3342;
    double sx = 4.4554;
    double sy = 3.224;

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
