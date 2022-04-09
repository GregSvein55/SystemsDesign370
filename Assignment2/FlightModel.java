 /**
 * Filename: FlightModel.java
 * 
 * Description: populates db, gets user flight info and saves it,
 * uses MVC pattern
 * 
 * Author: Gregory Sveinbjornson
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightModel {

    private List<Flight> flights = new ArrayList<Flight>();//creating a list of flights to be our db

    public void addFlights() {//populating db

        flights.add(new Flight("Regina", "Vancouver", 900, 300));
        flights.add(new Flight("Regina", "Vancouver", 1500, 350));
        flights.add(new Flight("Regina", "Toronto", 1300, 500));

    }

    public Flight retrieveFlightFromDatabase() {

        Scanner input = new Scanner(System.in);//new scanner
        Scanner input2 = new Scanner(System.in);//new scanner for ints

        System.out.println("Enter Departure City:");
        String depart = input.nextLine();//getting departure city from user

        System.out.println("Enter Arrival City :");
        String arrival = input.nextLine();//getting arrival city from user

    
        int numFlights = flights.size();
        for (int i = 0; i < numFlights; i++) {//listing all of the flights that meet the criteria

            //checking that the cities match
            if (flights.get(i).getDepartureCity().equals(depart) && flights.get(i).getArrivalCity().equals(arrival)) {
                //displaying info so it is readable
                System.out.println("(" + (i + 1) + ") " + flights.get(i).getDepartureCity() + " " 
                + flights.get(i).getArrivalCity() + " " + flights.get(i).getDepartureTime() + "H  $" 
                + flights.get(i).getPrice());
            }
        }

        System.out.println("Which flight do you want?");
        int flightChoice = input2.nextInt();//getting the flight wanted by the user

        flightChoice -= 1;//-1 to get selection from array

        Flight flight = flights.get(flightChoice);//getting flight that the user wants

        return flight;
    }

}