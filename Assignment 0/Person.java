/**
 * Filename: Person.java
 * 
 * Description: methods used for names in operator and customer classes
 * 
 * Author: Gregory Sveinbjornson
 */
public class Person {
    
    public String name;                             //declaring name variable

    Person(){
        name = "Greg";                              //settng default name to my name
    }

    public String getName() {                       //returning name
        return name;
    }

    public void setName(String nameString) {        //setting name to users name
        name = nameString;
    }



    
}


