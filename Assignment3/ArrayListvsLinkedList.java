/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 * 
*/
public class ArrayListvsLinkedList {

    /*
        REFACTOR OPERATION #1 
        Remove Dead Code
        This was chosen as the functions relating to
        Linked Lists were not used.

        This was the code removed

        private LinkedList<Integer> ll = new LinkedList<Integer>();

        public void linkedListCreation() {
         for (int i = 1; i <= N; i++) {
             ll.add(0, new Integer(i));
         }
     }

        public void linkedListAccess() {
         Object o;
         for (int i = 0; i < N; i++) {
             o = ll.get(i);
         }
      }
    */

    private ArrayList<Integer> al = new ArrayList<Integer>();
    
    private static final int N = 100000; // 1000000

    public void arrayListCreation() {
        for (int i = 1; i <= N; i++) {
            al.add(0, new Integer(i));
        }
    }

    public void arrayListAccess() {
        Object o;
        for (int i = 0; i < N; i++) {
            o = al.get(i);
        }
    }
}
