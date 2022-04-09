/**
 * Filename: Wheels.java
 * 
 * Description: Changes the Wheels and adds the cost
 * 
 * Author: Gregory Sveinbjornson
 */
public class Wheels extends CarDecorator{

    public Wheels(Mustang newMustang){
        super(newMustang);
        System.out.println("Changing wheels to alloy");
    }
    public String getWheels(){
        return "Alloy";
    }

    public int getPrice(){
        return tempMustang.getPrice() + 3000;
    }
}
