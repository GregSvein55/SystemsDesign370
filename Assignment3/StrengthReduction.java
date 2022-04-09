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
public class StrengthReduction {
    public int unreducedSum(int N) {
        int i = 0;
        int sum = 0;
        for (i = 0; i <= N; i++){
            sum += i;
        }
        return sum;
    }
    
    public int recursiveSum(int N) {
        if (N == 0) return 0;
        else return N + recursiveSum (N - 1);
    }

    public int reducedSum(int N) {
        return (N * (1 + N) / 2);
    }
}
