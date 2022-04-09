/**
 * Filename: Seats.java
 * 
 * Description: Changes the seats and adds the cost
 * 
 * Author: Gregory Sveinbjornson
 */
public class Seats extends CarDecorator{

    public Seats(Mustang newMustang){
        super(newMustang);
        System.out.println("Changing seats to leather");
    }
    public String getSeats(){
        return "Leather";
    }

    public int getPrice(){
        return tempMustang.getPrice() + 1500;
    }
}
