/**
 * Filename: CarDecorator.java
 * 
 * Description: abstract class, used to change the value of the specs
 * 
 * Author: Gregory Sveinbjornson
 */
public abstract class CarDecorator implements Mustang{

    protected Mustang tempMustang;

    public CarDecorator(Mustang newMustang){
        tempMustang = newMustang;
    }

    public int getPrice(){
        return tempMustang.getPrice();
    }

    public String getEngine(){
        return tempMustang.getEngine();
    }

    public String getColour(){
        return tempMustang.getColour();
    }

    public String getSeats(){
        return tempMustang.getSeats();
    }

    public String getWheels(){
        return tempMustang.getWheels();
    }

    public String getTransmission(){
        return tempMustang.getTransmission();
    }
}
