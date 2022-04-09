/**
 * Filename: RobotFactory.java
 * 
 * Description: Where the robots get their methods from, outlines variable and method types,
 * all robots look to this class
 * 
 * Author: Gregory Sveinbjornson
 */

public class RobotFactory {
   
    public String type;             //variables
    public String manufacturer;
    public int serialNumber;

    RobotFactory(){//consructor
        type = " ";
        manufacturer = " ";
        serialNumber = 10001;
        
    }


/*
* These methods can be used by any robot
*/   
    void fetchParts(String x){//fetching parts 
        System.out.println(x + " fetched");
    }

    void doTask(String x){//doing tasks
        
        System.out.println(x + " " + type);
    }

    void storeParts(String x){//storing parts
        System.out.println(x + " sent to storage");
    }



}
