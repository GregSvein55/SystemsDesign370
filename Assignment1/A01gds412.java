/**
 * Filename: A01gds412.java
 * 
 * Description: Main file for the robot program, user can run the fake robots from this file
 * 
 * Author: Gregory Sveinbjornson
 */
public class A01gds412 {
   public static void main(String[] args) {//main function
    Cutting Cut1 = new Cutting();           //creating instances as described in assignment
    Cutting Cut2 = new Cutting();
    Drilling Drill1 = new Drilling();
    Drilling Drill2 = new Drilling();
    Assembly Assemble = Assembly.getAssembly();//Singleton design method, can only be called once

    Cut1.fetchParts();                      //running cutting robot
    Cut2.fetchParts();
    Cut1.doTask();
    Cut2.doTask();
    Cut1.storeParts();
    Cut2.storeParts();

    Cut1.fetchParts();
    Cut2.fetchParts();
    Cut1.doTask();
    Cut2.doTask();
    Cut1.storeParts();
    Cut2.storeParts();

    Drill1.fetchParts();                      //running drilling robot
    Drill2.fetchParts();
    Drill1.doTask();
    Drill2.doTask();
    Drill1.storeParts();
    Drill2.storeParts();

    Drill1.fetchParts();
    Drill2.fetchParts();
    Drill1.doTask();
    Drill2.doTask();
    Drill1.storeParts();
    Drill2.storeParts();

    Assemble.fetchParts();                      //running assembly robot
    Assemble.fetchParts();
    Assemble.fetchParts();
    Assemble.fetchParts();
    Assemble.doTask();
    Assemble.storeParts();


   }

    
}
