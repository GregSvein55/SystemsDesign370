/**
 * Filename: Assembly.java
 * 
 * Description: file for assembly robot, use singleton design method to
 * make sure there is only one instance
 * 
 * Author: Gregory Sveinbjornson
 */

public class Assembly extends RobotFactory{

    static Assembly assembly = new Assembly();//Singleton design method! 
                                              //There can only be one instance of this class!
                                              //Also the design for this was taken directly out of the 
                                              //notes so credit goes to Dr. Kin-Choong Yow
    private Assembly() {//private constructor
        type = "Assembled";
        manufacturer = "SK Robotics";
        serialNumber = 30001;

        System.out.println("Assembly Robot Created");
        System.out.println(manufacturer + " " + serialNumber);

    }

    public static Assembly getAssembly() {
        return assembly;
    }

    public String before = "Drilled Part";//variables to be assigned into robot factory methods
    public String after = "Product";
   
    public void fetchParts() {//getting drilled parts
        fetchParts(before);
    }

    public void doTask() {//assembling...
        doTask(after);
    }

    public void storeParts() {//store finished product
        storeParts(after);
    }

    

}
