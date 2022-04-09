 /**
 * Filename: AddExtras.java
 * 
 * Description: Prompts the user and takes the user data to adjust the flight details,
 * uses MVC pattern
 * 
 * Author: Gregory Sveinbjornson
 */

import java.util.Scanner;

public class AddExtras {

    private FlightModel flightModel;
    private ViewFlight viewFlight;

    public AddExtras(FlightModel flightModel, ViewFlight flightView) {//overloaded constructor
        this.flightModel = flightModel;
        this.viewFlight = flightView;

    }

    public void readUserInput() {

        Flight flight = flightModel.retrieveFlightFromDatabase();//creating instance of flight class

        Scanner scan = new Scanner(System.in);//new scanner

        System.out.println("Do you want to add extra legroom seats (Y/N)?");

        String seat = scan.nextLine().toUpperCase();//getting use response

        System.out.println("Do you want to add in-flight meals (Y/N)?");

        String meal = scan.nextLine().toUpperCase();//getting use response

        System.out.println("Do you want to add excess baggage (Y/N)?");

        String baggage = scan.nextLine().toUpperCase();//getting use response

        MainTicketInterface ticket1;//we need three tickets to check the tree different parameters/add ons
        MainTicketInterface ticket2;
        MainTicketInterface ticket3;

        String departCity = flight.getDepartureCity();//declaring variables
        String arriveCity = flight.getArrivalCity();
        int departTime = flight.getDepartureTime();
        int price = flight.getPrice();

        switch(seat) {
            case "Y"://checking if user selected choice
                ticket1 = new Seat(new Ticket(departCity, arriveCity, departTime, price));//adding extra legroom
              break;
            default:
                ticket1 = new Ticket(departCity, arriveCity, departTime, price);//normal ticket with no extra legroom
              break;
        }

        switch(meal) {
            case "Y"://checking if user selected choice
                ticket2 = new Meal(ticket1);//adding a meal
                break;
            default:
                ticket2 = ticket1;//passing on the value of the previous ticket
                break;
        }

        switch(baggage) {
            case "Y"://checking if user selected choice
                ticket3 = new Baggage(ticket2);//adding baggage
                break;
            default:
                ticket3 = ticket2;//passing on the value of the previous ticket
                break;
        }

   
        viewFlight.displayFlights(flight, seat, meal, baggage, ticket3);//showing the user their choices

        

    }

}