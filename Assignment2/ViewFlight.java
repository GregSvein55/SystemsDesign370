 /**
 * Filename: ViewFlight.java
 * 
 * Description: tells user their choices and final cost,
 * uses MVC pattern
 * 
 * Author: Gregory Sveinbjornson
 */

public class ViewFlight {

    public void displayFlights(Flight flight, String seat, String meal, String baggage, MainTicketInterface ticket3) {

        String departCity = flight.getDepartureCity();
        String ariveCity = flight.getArrivalCity();
        int departTime = flight.getDepartureTime();
        int price = ticket3.updatePrice();

        System.out.println("Your final flight information is :");

        System.out.println("Departure City : " + departCity);

        System.out.println("Arrival City : " + ariveCity);
        
        if (departTime <= 999)//adding an extra 0 before single digit hours 
            System.out.println("Time : 0" + departTime + "H");
        else
            System.out.println("Time : " + departTime + "H");

        System.out.println("Extra Legroom : " + seat);

        System.out.println("In-flight meals : " + meal);

        System.out.println("Excess Baggage : " + baggage);

        System.out.println("Total Price : $" + price);

    }

}