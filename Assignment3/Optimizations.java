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
public class Optimizations {
static long tBeg, tEnd;
static int testSize = 1000;
    /**
     * @param args the command line arguments
     */


     /*
        REFACTOR #2
        Extract Function
        This was done as the main funtion was too long,
        so I split all the 7 tests up to make it easier to read and modify

        Original code was the same code as now, just split up into 7 methods
     */

    public static void main(String[] args) {
        
        System.out.println("Optimization example program\n\n");

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();

        System.out.println("\n\nTests complete, end of program");
        
    }

    static void test1() {
        StrengthReduction test1 = new StrengthReduction();
        tBeg = System.nanoTime();
        test1.recursiveSum(testSize);
        tEnd = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.unreducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Iterative time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.reducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Direct time:" + (tEnd - tBeg));
    }

    static void test2() {
        SubExpressionsElimination test2 = new SubExpressionsElimination();
        tBeg = System.nanoTime();
        test2.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test2.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
    }

    static void test3() {

        SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
        // Initialize random number generator: do it in the class or here?
        // Random rd = new Random();
        tBeg = System.nanoTime();
        test3.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test3.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
    }

    static void test4() {
        SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        tBeg = System.nanoTime();
        test4.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test4.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
    }

    static void test5() {
        CodeMotion test5 = new CodeMotion();
        // Note that the default constructor is lazy and initializes only when the class is needed in this case
        tBeg = System.nanoTime();
        test5.codeInsideLoop();
        tEnd = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test5.codeOutsideLoop();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
    }

    static void test6() {

        ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" ArrayList Access:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Access:" + (tEnd - tBeg));
    }

    static void test7() {
        StringOperations test7 = new StringOperations();
        tBeg = System.nanoTime();
        test7.usingPlus();
        tEnd = System.nanoTime();
        System.out.println("\n\nString Operations\n Using + :" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test7.usingStringBuffer();
        tEnd = System.nanoTime();
        System.out.println(" Using StringBuffer :" + (tEnd - tBeg));
    }
    
}
