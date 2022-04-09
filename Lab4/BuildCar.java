/**
 * Filename: BuildCar.java
 * 
 * Description: Builds the car, where a user interface would be if one
 * was required, also contains main function
 * 
 * Author: Gregory Sveinbjornson
 */
public class BuildCar {
    public void buildingCar() {
        Mustang mustang = new Base();

        System.out.println("Here are your current specs:");
        System.out.println("Engine: " + mustang.getEngine());
        System.out.println("Colour: " + mustang.getColour());
        System.out.println("Seats: " + mustang.getSeats());
        System.out.println("Wheels: " + mustang.getWheels());
        System.out.println("Transmission: " + mustang.getTransmission());
        System.out.println("Price: $" + mustang.getPrice() + "\n");

        //if a user interface was required I would have
        //put it here and asked the user what they wanted.
        //Instead, I just assume they want all the extras
        //cause they want a cool car
        mustang = new Engine(mustang);
        mustang = new Colour(mustang);
        mustang = new Seats(mustang);
        mustang = new Wheels(mustang);
        mustang = new Transmission(mustang);

        System.out.println("\nHere are your new specs:");
        System.out.println("Engine: " + mustang.getEngine());
        System.out.println("Colour: " + mustang.getColour());
        System.out.println("Seats: " + mustang.getSeats());
        System.out.println("Wheels: " + mustang.getWheels());
        System.out.println("Transmission: " + mustang.getTransmission());
        System.out.println("Price: $" + mustang.getPrice());
    }

    public static void main(String[] args) {
        BuildCar buildCar = new BuildCar();
        buildCar.buildingCar();
    }
}

