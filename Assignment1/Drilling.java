/**
 * Filename: Drilling.java
 * 
 * Description: Drilling robot in factory, drills alreeady cut pieces
* can have more than one instance
 * 
 * Author: Gregory Sveinbjornson
 */

public class Drilling extends RobotFactory{

    static int counter = 20000;//this is used to assign unique serial numbers

    Drilling(){//constructor
        type = "Drilled";
        manufacturer = "Regina Machines";
        counter++;
        serialNumber = counter;

        System.out.println("Drilling Robot Created");
        System.out.println(manufacturer + " " + serialNumber);
    }

    public String before = "Cut part";//variables to be assigned into robot factory methods
    public String after = "Drilled part";
   
    public void fetchParts() {//get cut parts
        fetchParts(before);
    }

    public void doTask() {//drill
        doTask(before);
    }

    public void storeParts() {//store drilled pieces
        storeParts(after);
    }


}
