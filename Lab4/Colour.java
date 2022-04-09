/**
 * Filename: Colour.java
 * 
 * Description: Changes the colour and adds the cost
 * 
 * Author: Gregory Sveinbjornson
 */
public class Colour extends CarDecorator{

    public Colour(Mustang newMustang){
        super(newMustang);
        System.out.println("Changing colour to red");
    }

    public String getColour(){
        return "Red";
    }

    public int getPrice(){
        return tempMustang.getPrice() + 1000;
    }
}
