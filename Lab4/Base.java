/**
 * Filename: Base.java
 * 
 * Description: Sets all the specs to base for the mustang
 * aka the cheapest possible combination
 * 
 * Author: Gregory Sveinbjornson
 */
public class Base implements Mustang{
    public int getPrice(){
        return 28000;
    }

    public String getEngine(){
        return "EcoBoost";
    }

    public String getColour(){
        return "Black";
    }

    public String getSeats(){
        return "Cloth";
    }

    public String getWheels(){
        return "Steel";
    }

    public String getTransmission(){
        return "EcoBoost";
    }
}
