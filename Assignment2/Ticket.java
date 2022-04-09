/**
 * Filename: Ticket.java
 * 
 * Description: subclass of MainTicketInterface and Flight, 
 * uses Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class Ticket extends Flight implements MainTicketInterface {

    public Ticket(String departureCity, String arrivalCity, int departureTime, int price) {//overloage constructor
        super(departureCity, arrivalCity, departureTime, price);//super refers to Flight
    }

    public int updatePrice() {//gets price for other updatePrice functions
        int price = super.getPrice(); 
        return price;
    }

}