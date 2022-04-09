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
public class CodeMotion {

    static final int ARLEN = 50000;
    static final double[] x = new double[ARLEN];
    static final double y = (new Random()).nextDouble();

    public void codeInsideLoop() {
        for (int i = 0; i < x.length; i++) {
            x[i] *= Math.PI * Math.cos(y);
        }
    }

    public void codeOutsideLoop() {
        double picosy = Math.PI * Math.cos(y);
        for (int i = 0; i < x.length; i++) {
            x[i] *= picosy;
        }
    }

}
