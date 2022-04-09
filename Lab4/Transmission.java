/**
 * Filename: Transmission.java
 * 
 * Description: Changes the Transmission and adds the cost
 * 
 * Author: Gregory Sveinbjornson
 */
public class Transmission extends CarDecorator{

    public Transmission(Mustang newMustang){
        super(newMustang);
        System.out.println("Changing transmission to manual");
    }
    public String getTransmission(){
        return "Automatic";
    }

    public int getPrice(){
        return tempMustang.getPrice() + 4000;
    }

}
