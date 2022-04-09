/**
 * Filename: Cutting.java
 * 
 * Description: Cutting robot in factory, gets raw materials and makes cuts
 * can have more than one instance
 * 
 * Author: Gregory Sveinbjornson
 */


public class Cutting extends RobotFactory{
    
    static int counter = 10000;  //this is used to assign unique serial numbers

    Cutting(){//constructor
        type = "Cut";
        manufacturer = "Regina Machines";
        counter++;//incrementing serial numbers
        serialNumber = counter;
        
        
        System.out.println("Cutting Robot Created");//creating the robot
        System.out.println(manufacturer + " " + serialNumber);
    }

    public String before = "Raw Material";//variables to be assigned into robot factory methods
    public String after = "Cut part";
   
    public void fetchParts() {//fetch raw material
        fetchParts(before);
    }

    public void doTask() {//cut pieces
        doTask(before);
    }

    public void storeParts() {//store cut pieces
        storeParts(after);
    }
    


    

}
